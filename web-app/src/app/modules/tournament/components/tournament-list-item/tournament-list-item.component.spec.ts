import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TournamentListItemComponent } from './tournament-list-item.component';

describe('TournamentListItemComponent', () => {
  let component: TournamentListItemComponent;
  let fixture: ComponentFixture<TournamentListItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TournamentListItemComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TournamentListItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
