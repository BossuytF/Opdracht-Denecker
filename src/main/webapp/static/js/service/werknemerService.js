webapp.factory('WerknemerService', ['$resource', function ($resource) {
    //$resource() function returns an object of resource class
    return $resource(
            'http://localhost:8080/WerknemerWebApp/werknemer/:nummer', 
            {nummer: '@nummer'},
            {
                update: {
                      method: 'PUT' // To send the HTTP Put request when calling this custom update method.
                }
                 
            }
    );
}]);