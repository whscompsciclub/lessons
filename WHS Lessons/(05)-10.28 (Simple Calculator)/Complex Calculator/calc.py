import re


class Calculator:
    def __init__(self, s):
        self.s = s
        self.s.replace(' ', '')
        self.idx = 0
        self.value = self.expr()

    def has_more(self):
        return self.idx < len(self.s)

    def found(self, s):
        if self.has_more() and str.startswith(self.s, s, self.idx):
            self.idx += len(s)
            return True
        return False

    # parse expression
    def expr(self):
        return self.add_sub()

    # parse / evaluate addition & subtraction
    def add_sub(self):
        num = self.mult_div()
        while True:
            if self.found('+'):
                num += self.mult_div()
            elif self.found('-'):
                num -= self.mult_div()
            else:
                break
        return num

    # parse / evaluate multiplication or division
    def mult_div(self):
        num = self.unary()
        while True:
            if self.found('*'):
                num *= self.unary()
            elif self.found('/'):
                num /= self.unary()
            else:
                break
        return num

    # unary operator (+1, -1)
    def unary(self):
        negative = False
        if self.found('+'):
            pass
        elif self.found('-'):
            negative = True
        num = self.exp()
        return -num if negative else num

    # exponentiation (right-associative)
    def exp(self):
        nums = [self.num()]
        while self.found('^'):
            nums.append(self.num())
        num = nums.pop()
        for i in reversed(nums):
            num = pow(i, num)
        return num

    # number or parenthesized expression
    def num(self):
        if self.found('('):
            num = self.expr()
            if not self.found(')'):
                raise Exception(
                    f'Expected a closing parenthesis at char {self.idx + 1}')
            return num
        match = re.search(r'^\d+(\.\d+)?(e-?\d+)?', self.s[self.idx:])
        if match:
            res = match.group()
            self.idx += len(res)
            return float(res)
        else:
            raise Exception(f'Expected a number at char {self.idx + 1}')

    @classmethod
    def eval(cls, s):
        return Calculator(s).value


if __name__ == "__main__":
    # print('Testing...')
    # assert Calculator.eval('3+(4*6-3)') == 24
    # assert Calculator.eval('4*2^3^3') == 536870912
    # assert Calculator.eval('76*6*(3+4)/(2+1)') == 1064
    # print('Tests passed')
    print(f'{ Calculator.eval(input()) }')
