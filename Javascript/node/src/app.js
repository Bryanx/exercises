import $ from 'jquery';
import {testje} from "./js/test";
import toTitleCase from "to-title-case";
import "./css/test.scss";

$("h1").click(function() {
    console.log(testje());
    console.log(toTitleCase("hello from app.js"));
});