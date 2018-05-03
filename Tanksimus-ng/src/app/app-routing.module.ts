import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { SigninComponent } from './signin/signin.component';

import { ViewOfferComponent } from './view-offer/view-offer.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'tank-offer/:id', component: ViewOfferComponent},
  {path: 'login', component: SigninComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
