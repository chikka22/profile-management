


var Route = Backbone.Router.extend({
    routes:{"":'home',
        "login":"login"},
    'home':function(){
        console.log('hi Home');

    },
    login:function(){
        console.log('hi Login');
    }
});

var router= new Route();
Backbone.history.start();
router.navigate('/login');