"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.keysToBeExcludedFormRecursiveFunc = exports.mapOfTailwindNames = exports.mapOfUnits = exports.jsonKeyMap = void 0;
exports.jsonKeyMap = {
    '--': '-negative-',
    '+': '',
    xs: 'xSmall',
    sm: 'small',
    md: 'medium',
    lg: 'large',
    xl: 'xLarge',
};
var convertStringWithUnitPostFixToNumber = function (value, unitPostFix, scalar) {
    return parseFloat(value.replace(unitPostFix, '')) * scalar;
};
exports.mapOfUnits = {
    px: { type: 'number', converter: function (value) { return convertStringWithUnitPostFixToNumber(value, 'px', 1); } },
    em: { type: 'number', converter: function (value) { return convertStringWithUnitPostFixToNumber(value, 'em', 1); } },
};
exports.mapOfTailwindNames = { color: 'colors', sizing: 'size', spacing: 'space', elevation: 'boxShadow' };
exports.keysToBeExcludedFormRecursiveFunc = ['elevation'];
