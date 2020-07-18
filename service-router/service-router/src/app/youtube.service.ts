import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {
  playlist = [
    {id: '2DGxm1csQQM', song: 'Levianth & Axol - Remember (feat. The Tech Thieves) [NCS Release]'},
    {id: 't4IOgVatNLI', song: 'Cream Blade - Heavenly (feat. Romi) [NCS Release]'},
    {id: 'n79aphwhpW0', song: 'Y&V - Lune [NCS Release]'},
    {id: 'BQX9x6P5w7k', song: 'Warsongs: Flash Funk (Marshmello Remix) | Music - League of Legends'},
    {id: 'VrDD2GSNs_I', song: 'Anna Yvette - Red Line [NCS Release]'}
  ];
  constructor() { }
  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
