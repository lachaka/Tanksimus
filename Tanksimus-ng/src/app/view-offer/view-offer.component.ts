import { Component, OnInit } from '@angular/core';
import { OfferService, Offer, Tank } from '../services/offer/offer.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-view-offer',
  templateUrl: './view-offer.component.html',
  styleUrls: ['./view-offer.component.scss']
})
export class ViewOfferComponent implements OnInit {
    offer: Offer;
    private offerId;
    tank: Tank;

    private tankDescription: string;
    private price: number;

  constructor( private offerService: OfferService ) { }

  ngOnInit() {
      this.getOfferById();
  }

  getOfferById() {

    this.offerService.getOfferById(this.offerId)
      .subscribe(data => {
      this.offer = data;
      console.log(data);
    });

  }
}
