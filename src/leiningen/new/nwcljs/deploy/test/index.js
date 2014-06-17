var fs = require('fs')
var assert = require('assert')
describe("test from js",function(){
    it("should be runable",function(){
        assert.equal(1,1)
    })
})

try{
    eval(fs.readFileSync('./node_modules/cljstests/cljstests.js','utf-8'))
} catch(e) {
    console.log("encounter an error in testing: ",e.stack)
}

/*
eval(fs.readFileSync('./goog.js','utf-8'))
global.goog = goog


var tests = fs.readdirSync('../tests/')
var mods = []
var bufs = []

tests.forEach(function(o){
	var foo = o.replace('-','_').split(".")
	mods.push(foo[0])
})

mods.forEach(function(o){
	bufs.push(fs.readFileSync('./node_modules/cljstests/{{name}}/tests/'+ o + ".js", "utf-8"))
})

var ordRequire = goog.require
goog.require = function(o) {
    var path = o.replace('-','_').split('.').join('/')
    eval(fs.readFileSync('./node_modules/cljstests/'+path+'.js'))
    global.{{name}} = {{name}}
    ordRequire.call(goog,o)
}


try{
    eval(fs.readFileSync('./node_modules/cljstests/cljstests.js','utf-8'))
    bufs.forEach(eval)
} catch(e) {
    console.log(e)
}


/*
var ordRequire = goog.require
goog.require = function(o) {
    var path = o.replace('-','_').split('.').join('/')
    console(path)
    global.{{name}} = {{name}}
    eval(fs.readFileSync('./node_modules/cljstests/'+path+'.js'))
    ordRequire.call(goog,o)
}

var tests = fs.readdirSync('../tests/')
var log = function(o){	console.log(o) }
var mods = []
var bufs = []

/*
var tests = fs.readdirSync('../tests/')
var log = function(o){	console.log(o) }
var mods = []
var bufs = []
var proj = "{{name}}"

tests.forEach(function(o){
	var foo = o.split(".")
	mods.push(foo[0])
})



mods.forEach(function(o){
	bufs.push(fs.readFileSync('./node_modules/'+proj+'/'+proj+'/tests/' + o + ".js", "utf-8"))
})


eval(fs.readFileSync('./goog.js','utf-8'))

global.goog = goog
eval("global."+proj+"="+proj)

global.use = function(name) {
    var path = name.split('.').join('/')
	eval(fs.readFileSync('./node_modules/'+proj+'/'+path+'.js','utf-8'))
	goog.require(name)
}


try{
    bufs.forEach(eval)
} catch(e) {
	log("cljs tests error: ",e)
}
*/
