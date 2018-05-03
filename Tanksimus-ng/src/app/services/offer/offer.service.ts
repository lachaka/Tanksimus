import { Injectable } from '@angular/core';

import {HttpClientModule, HttpClient, HttpHeaders} from '@angular/common/http';


@Injectable()
export class OfferService {

  private httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  getOffers() {
    return this.http.get<Offer[]>(`localhost:8080/api/rent_offer`);
  }

  /*
    getOffers() {
      return this.http.get<Offer>(`localhost:8080` + `rent_offer/${playerId}`);
    }
*/
}

export interface Offer {
  id;
  tankId;
  description;
  price;
  time;
}
