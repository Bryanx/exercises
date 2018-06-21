import $ from 'jquery';
import {getCities} from "../js/jsonServer";

export function submitCityForm(){
    $.post({
        url: "http://localhost:3000/cities",
        data: $("#addCity").serialize(),
        success: data => {
            $("#cities").empty();
            getCities();
        }
    })
}