let strArr = ["1,3,4,7,13", "2,4,13,19"];
console.log(strArr.length);
console.log(findIntersection(strArr));

function findIntersection(strArr) {
    let firstArray = strArr[0].split(',');
    let secondArray = strArr[1].split(',');

    console.log(firstArray);
    let common = [];
    for (let i = 0; i < firstArray.length; i++) {
        if (secondArray.includes(firstArray[i])) {
            common.push(firstArray[i]);
        }
    }
    console.log(common);
    if (common.length > 0)
        return (common.map(Number));
    else
        return false;

}