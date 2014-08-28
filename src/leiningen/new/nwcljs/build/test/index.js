var fs = require('fs')
var assert = require('assert')
var glob = require('glob')


var srcBuf = ""


function loadScript(path) {
	var src = fs.readFileSync(path,'utf-8')
	srcBuf += src
}


function execScript() {
	with(global){
		eval(srcBuf)
	}
}


loadScript('./goog.js')


try{
        var files = glob.sync("node_modules/cljstests/{{name}}/**/*.js")
            files.push.apply(files,glob.sync("node_modules/cljstests/test/**/*.js"))
            files.forEach(loadScript)
            execScript()
} catch(e) {
        console.log("encounter an error in testing: ",e.stack)
}


describe("Running cljs tests in nodejs",function(){
    it("should be runable",function(){
        assert(test.hi.hi)
    })
})
