let str = "Hello coders";
console.log(rev(str));

function rev(str) {
    let revStr = "";
    if (str.length === 0 || str === " ")
        return str;
    let temp = "";
    for (let i = 0; i < str.length; i++) {
        if (str[i] != ' ') {
            temp = str[i] + temp;
        }
        else {
            revStr += temp;
            temp = "";
            if (i > 1) {
                revStr += " ";
            }
        }
        if(i===str.length-1)
            revStr += temp;
    }
    return revStr;
}