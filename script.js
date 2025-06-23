let display = document.getElementById('display');
let currentInput = '';
let currentOperator = '';
let previousValue = null;

function appendNumber(number) {
  if (display.textContent === '0' && number !== '.') {
    display.textContent = number;
  } else {
    display.textContent += number;
  }
}

function clearDisplay() {
  display.textContent = '0';
  currentInput = '';
  previousValue = null;
  currentOperator = '';
}

function plusMinus() {
  let value = parseFloat(display.textContent);
  if (!isNaN(value)) {
    display.textContent = (value * -1).toString();
  }
}

function percentage() {
  let value = parseFloat(display.textContent);
  if (!isNaN(value)) {
    display.textContent = (value / 100).toString();
  }
}

function operate(operator) {
  previousValue = parseFloat(display.textContent);
  currentOperator = operator;
  display.textContent = '';
}

function calculate() {
  let currentValue = parseFloat(display.textContent);
  if (currentOperator && previousValue !== null) {
    let result;
    switch (currentOperator) {
      case '+': result = previousValue + currentValue; break;
      case '-': result = previousValue - currentValue; break;
      case '*': result = previousValue * currentValue; break;
      case '/': result = currentValue === 0 ? 'Error' : previousValue / currentValue; break;
    }
    display.textContent = result.toString();
    previousValue = null;
    currentOperator = '';
  }
}
