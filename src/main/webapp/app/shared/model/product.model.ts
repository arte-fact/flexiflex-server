export interface IProduct {
    id?: number;
    urls?: any;
    title?: string;
    synopsis?: any;
    tmdbId?: number;
}

export class Product implements IProduct {
    constructor(public id?: number, public urls?: any, public title?: string, public synopsis?: any, public tmdbId?: number) {}
}
