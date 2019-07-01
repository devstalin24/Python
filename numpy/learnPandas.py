# import numpy as np
# import pandas as pa
# from matplotlib import pyplot as plt
# pelement  =  pa.Series([1,2,3,"Aman",4,5])
# print(pelement)
# nparray = np.array([1,2,3,4,5])
# print(nparray)

from math import radians
import numpy as np     # installed with matplotlib
import matplotlib.pyplot as plt
import math
import calendar
def create_sample_chart():
    x_series = np.arange(10)
    y_series = x_series

    #Plotting to our canvas in memory
    plt.plot(y_series)
    #Title of our canvas
    plt.title('String Title Here')
    #X-axis label
    plt.xlabel('X Axis Title Here')
    #Y_axis label
    plt.ylabel('Y Axis Title Here')

    #Showing what we plotted
    plt.show()

create_sample_chart()


def bar_plot():
    x_series = np.arange(10)
    y_series = x_series**2

    #Plotting to our canvas in memory
    plt.plot(y_series)
    #Title of our canvas
    plt.title('String Title Here')
    #X-axis label
    plt.xlabel('X Axis Title Here')
    #Y_axis label
    plt.ylabel('Y Axis Title Here')

    #Showing what we plotted
    plt.show()

bar_plot()