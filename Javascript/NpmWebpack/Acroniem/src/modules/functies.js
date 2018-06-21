export function acroniem(zin) {
    return zin
        .split(" ")
        .map(w => w.charAt(0))
        .reduce((a,b) => a+b);
}