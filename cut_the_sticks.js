process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var n = parseInt(readLine());
    arr = readLine().split(' ');
    arr = arr.map(Number);
    
    for(var i = 0; i < n; i++) {
        var minCut = findMinCutLength(arr);
        if (minCut === 0)
            break;
        console.log(remainingSticks(arr));
        
        for(var j=0; j < n; j++) {
            if (arr[j] !== 0)
                arr[j] = arr[j] - minCut;
        }
    }
    

}

function remainingSticks(arr) {
    var count = 0;
    for(var i=0; i < arr.length; i++) {
        if (arr[i] !== 0)
            count++;
    }
    return count;
}

function findMinCutLength(arr) {
    var min = 99999;
    for(var i=0; i < arr.length; i++) {
        if(min > arr[i] && arr[i] !== 0) {
            min = arr[i];
        }
    }
    
    return (min === 99999) ? 0 : min;
}
