import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListedOfferComponent } from './listed-offer.component';

describe('ListedOfferComponent', () => {
  let component: ListedOfferComponent;
  let fixture: ComponentFixture<ListedOfferComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListedOfferComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListedOfferComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
