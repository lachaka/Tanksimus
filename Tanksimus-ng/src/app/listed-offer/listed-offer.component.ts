import { Component, OnInit } from '@angular/core';

import { OfferService, Offer } from '../services/offer/offer.service';

@Component({
  selector: 'app-listed-offer',
  templateUrl: './listed-offer.component.html',
  styleUrls: ['./listed-offer.component.scss'],
  providers: [OfferService]
})
export class ListedOfferComponent implements OnInit {

  private offers: Offer[] = [];
  private description: string;
  private price: number;

  constructor( private offerService: OfferService) { }

  ngOnInit() {
      this.getOffers();
  }

  getOffers() {
    this.offerService.getOffers()
      .subscribe(data => {
      this.offers = data;
      console.log(data);
    });
  };
}
