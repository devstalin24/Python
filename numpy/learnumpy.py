#import numpy as np
import numpy as np
import matplotlib.pyplot as plt
a = np.array([1.2,2,3])
print(a)
print(a.dtype)
b =  np.empty((3))
print(b)
print(b.dtype)
c = np.arange(1,10,1)
print(c)
print(c.dtype)
d = np.arange(10)
print(d)
e = d<5
print(e[0])
f = np.arange(12).reshape(3,4)
print(f)
print(f[0])
print(f.sum(axis=0))
print(f.sum(axis=1))



# Build a vector of 10000 normal deviates with variance 0.5^2 and mean 2
mu, sigma = 2, 0.5
v = np.random.normal(mu,sigma,10000)
# Plot a normalized histogram with 50 bins
plt.hist(v, bins=50, density=1)       # matplotlib version (plot)
plt.show()