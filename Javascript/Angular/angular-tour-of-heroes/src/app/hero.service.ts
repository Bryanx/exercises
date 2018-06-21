import { Injectable } from '@angular/core';
import { Hero } from './models/hero';
import { HEROES } from './mock-heroes';
import { Observable, of } from 'rxjs';

//Deze decorator betekent dat er dependency injection kan plaatsvinden:
@Injectable({
  providedIn: 'root'
})
export class HeroService {

  constructor() { }

  getHeroes(): Observable<Hero[]> {
    return of(HEROES);
  }

}
