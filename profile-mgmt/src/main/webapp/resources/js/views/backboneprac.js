
//11620391587

//'gajapathi'



var Model=Backbone.Model.extend({
    urlRoot:'http://localhost:4567/getMyDetails/sunny',

    defaults:{
        lastName:'Chokkka',
        firstName:'Mohini'
    }
});


var BackboneJsView= Backbone.View.extend({

    el: 'div',
    name: 'gandi',

    initialize: function (options) {
        this.options =options || {};
        this.render();
        this.model.listenTo(this.model, 'change', this.render1);
        this.model.fetch();
    },

    events: {
        'click #addEmp': 'addEmp'
    },

    render: function () {
        var _this=this;
        this.$el.append("<li>Welcome "+this.options.myVal+" </li> ");

        //  $('#divid1').append(this.$el);


    },
    render1: function () {

        console.log('welcome render1 ' + this.get('val'));
    },


    addEmp: function (eve) {
        this.model.set({'val':this.model.get('val') + 2});
        this.model.set({'name':'rao'});


      // this.model.set({'val':this.model.get('val') + 2},{ silent: true });

        this.$el.append("<ul> <li> firstName: " + this.options.sing + this.model.get('firstName') + ' val: ' + this.model.get('val') + "</li> </ul>");
    }
})

var model= new Model({ name:'Gandiiii', val:1});

var listView = new BackboneJsView({ model:model, myVal:'val' , sing:'sisnger'});

$(function() {
    console.log( "ready Sunny Gandi!" );
});