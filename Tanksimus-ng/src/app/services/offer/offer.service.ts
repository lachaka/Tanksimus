import { Injectable } from '@angular/core';

import {HttpClient, HttpHeaders} from '@angular/common/http';


@Injectable()
export class OfferService {

  private httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  getOffers() {
    return this.http.get<Offer[]>(`http://localhost:8080/api/rent-offer`);
  }

  getOfferById(offerId) {
      return this.http.get<Offer>(`http://localhost:8080/api/rent-offer/${offerId}`)
  }
}

export interface Offer {
  id;
  Tank?;
  description?;
  price?;
  time?;
}

export interface Tank {
    id;
    name;
    speed;
    length;
    width;
    height;
    weight;
    crew;
    engine;
    country;
    producer;
    type;
    power;
}
