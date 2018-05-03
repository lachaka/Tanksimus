import { Component, OnInit } from '@angular/core';

import {
    AuthService,
    FacebookLoginProvider,
    GoogleLoginProvider
} from 'angular5-social-login';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.scss']
})
export class SigninComponent implements OnInit {

  constructor( private socialAuthService: AuthService ) {}

  public socialSignIn(socialPlatform : string) {
    let socialPlatformProvider;
    if (socialPlatform == "google") {
      socialPlatformProvider = GoogleLoginProvider.PROVIDER_ID;
    }

    this.socialAuthService.signIn(socialPlatformProvider).then(
      (userData) => {

        console.log(socialPlatform+" sign in data : " , userData);
      }
    );
  }

  ngOnInit() {
  }
}
