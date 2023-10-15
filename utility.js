export const isSnakeCase = str => {
    if (!isString(str)) return false;

    if (isStringEmpty(str)) return false;

    if (doesStringContainUpperCaseLetters(str)) return false;

    if (doesStringContainWhitespace(str)) return false;

    if (doesStringStartOrEndWithUnderScore(str)) return false;

    if (doesStringContainConsecutiveUnderscores(str)) return false;

    if (doesStringContainNonAlphanumericCharactersExceptUnderScore(str)) return false;

    return true;
};

const isString = arg => typeof arg === 'string';
const isStringEmpty = str => str.length === 0;
const doesStringContainUpperCaseLetters = str => /[A-Z]/.test(str);
const doesStringContainWhitespace = str => /\s/.test(str);
const doesStringStartOrEndWithUnderScore = str => str.startsWith('_') || str.endsWith('_');
const doesStringContainConsecutiveUnderscores = str => /\_{2,}/.test(str);
const doesStringContainNonAlphanumericCharactersExceptUnderScore = str => !/^[a-zA-Z0-9_]+$/.test(str);

const convertToCamelCase = (str) => {
    // Check if the string is empty or not a string
    if (typeof str !== 'string' || str.length === 0) {
      return '';
    }
  
    // Split the string by underscore or hyphen
    const words = str.split(/[_-]/);
  
    // Capitalize the first letter of each word except the first word
    const camelCaseWords = words.map((word, index) => {
      if (index === 0) {
        return word;
      }
      return word.charAt(0).toUpperCase() + word.slice(1);
    });
  
    // Join the words together
    return camelCaseWords.join('');
  };
  