var rungsApp = angular.module("rungsApp", []);

rungsApp.controller("rungsController", ['$scope', '$http', function ($scope, $http){
	$http.get("../../data").success(function(data) {
		console.log(data);
		$scope.positions = data;
	});
}]);

