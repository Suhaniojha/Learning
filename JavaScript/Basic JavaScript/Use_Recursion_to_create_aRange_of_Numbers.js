function rangeOfNumbers(startNum, endNum) {
  if(endNum<startNum){
    return[];
  }
  const arrNum = rangeOfNumbers(startNum,endNum-1);
  arrNum.push(endNum);
  
  return arrNum;
};