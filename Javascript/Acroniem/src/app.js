import {acroniem} from "./modules/functies";
import {wordlist} from "./modules/wordlist";
import $ from 'jquery';

let res = acroniem("Karel de Grote");
let el = $("#result");
el.html(res);
el.append("<br>" + wordlist.filter(w => w.length === 33).map(w => w.charAt(1)).join(""));
el.append("<br>" + wordlist.reduce((a, b) => a.length > b.length ? a : b));
el.append("<br>");
wordlist.filter(w => w.charAt(0).toLowerCase() === 'q').forEach(e => el.append("<br>" + e));

