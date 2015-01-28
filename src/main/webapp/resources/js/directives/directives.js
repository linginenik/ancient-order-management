/*jshint smarttabs: true */

agro.directive('dateParser1', function($filter){
	return {
		restrict: 'A',
		require: 'ngModel',
		link: function(scope, element, attrs,ngModel){

		      scope.$watch(attrs.ngModel, function (modelValue) {
		    	  if(modelValue){
		    		  var time= $filter('date')(modelValue, "yyyy-MM-dd");
		    		  scope.inventory.manufactureDate=time;
		    	  }
		      });

//	            element.on('changeTime', function() {
//	                if(!scope.$$phase) {
//	                    var date = element.timepicker('getTime', ngModel.$modelValue);
//	                    var time = date.getHours() + ":" + date.getMinutes();
//	                    ngModel.$setViewValue(time);
//	                    scope.$apply();
//	                }
//	            });
		},
	};
});
//agro.directive('formatDate', function ($filter) {
//    return {
//	    restrict: 'A',
//	    require: 'ngModel',
//        link: function (scope, element, attrs, ctrl) {
//            ctrl.$formatters.unshift(function (modelValue) {
//            	if(modelValue) {
//            		return $filter('date')(modelValue, attrs.formatDate);
//            	}
//            });         
//        },
//    };
//});