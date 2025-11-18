function printPattern(num) {
  const digits = String(num).split("").map(Number);
  const max = Math.max(...digits);

  for (let level = max; level >= 1; level--) {
    let row = "";

    for (let d of digits) {
      if (d >= level) row += "*  ";
      else row += "   ";
    }

    console.log(row);
  }
}

printPattern(243);