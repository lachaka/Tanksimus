import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { TankComponent } from './tank/tank.component';
import { ListedOfferComponent } from './listed-offer/listed-offer.component';
import { NavigationComponent } from './navigation/navigation.component';

import {
    SocialLoginModule,
    AuthServiceConfig,
    GoogleLoginProvider
} from "angular5-social-login";

import { SigninComponent } from './signin/signin.component';

export function getAuthServiceConfigs() {
  let config = new AuthServiceConfig(
      [
        {
          id: GoogleLoginProvider.PROVIDER_ID,
          provider: new GoogleLoginProvider("927533912212-0nasfb1a3ke0e27uck37rm1951s20os9.apps.googleusercontent.com")
        }
      ]
  );
  return config;
}

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    TankComponent,
    ListedOfferComponent,
    NavigationComponent,
    SigninComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SocialLoginModule,
    NgbModule.forRoot()
  ],
  providers: [
    {
      provide: AuthServiceConfig,
      useFactory: getAuthServiceConfigs
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
