var app = angular.module("application",[]);
app.controller("controller", function($scope){

	$scope.add = function(){
		var a = Number($scope.first);
		var b = Number($scope.second);
		$scope.result = a+b;
	}
	$scope.sub = function(){
		var a = Number($scope.first);
		var b = Number($scope.second);
		$scope.result = a-b;
	}

	$scope.mul = function(){
		var a = Number($scope.first);
		var b = Number($scope.second);
		$scope.result= a*b;	
	}

	$scope.div = function(){
		var a = Number($scope.first);
		var b = Number($scope.second);

		if(b==0){
			$scope.result="EXCEPTION: DIVIDE BY 0";
		}
		else{
			$scope.result=a/b;
		}
	}

	$scope.sinf = function(){
		var angle = Number($scope.angle);
		angle = (angle*Math.PI)/180;

		$scope.result2 = Math.sin(angle);
	}
	$scope.cosf = function(){
		var angle = Number($scope.angle);
		angle = (angle*Math.PI)/180;

		$scope.result2 = Math.cos(angle);
	}
	$scope.tanf = function(){
		var angle = Number($scope.angle);
		angle = (angle*Math.PI)/180;

		$scope.result2 = Math.tan(angle);
	}


});
