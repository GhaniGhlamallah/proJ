X = [x for x in range(-100, 100)]
Y_exp = [exp(x) for x in X]
Y_log = [log(x) if x > 0 else None for x in X]

xlim(-2, 4)
ylim(-2, 4)
axhline(0,  linewidth=1)
axvline(0,  linewidth=1)
plot(X, X, label='x')
plot(X, Y_exp, label='exp(x)')
plot(X, Y_log, label='log(x)')
legend()
show()