import {doFetchApiCall} from "./js/ajax";
import {getCities} from "./js/jsonServer";
import {submitCityForm} from "./js/post";
import $ from 'jquery';


$("#btnGetUser").click(doFetchApiCall);
getCities();

$("#addCity").on("submit", e => {
    e.preventDefault();
    submitCityForm();
});