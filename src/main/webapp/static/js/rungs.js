var model = {
	player: "Simon",
	points: 15
};

console.log("Hello");

var rungsApp = angular.module("rungsApp", []);

rungsApp.controller("rungsController", function ($scope){
	$scope.positions = model;
});