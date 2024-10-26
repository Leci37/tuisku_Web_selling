//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ETHUSDT_30Min_1WIL_216dda3b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1WIL_216dda3b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_216dda3b(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 9.54561 )
		if( sDev <= 1.34571 )
			if( wvf <= 2.76727 )
				if( sDev <= 1.13983 )
					if( wvf <= 0.851445 )
						if( upperBand <= 1.92412 )
							if( lowerBand <= -0.202924 )
								if( Color_con2 <= -2.03956 )
									ret := 0.350000
								if( Color_con2 > -2.03956 )
									ret := 0.105820
							if( lowerBand > -0.202924 )
								if( wvf <= 0.221272 )
									ret := 0.121032
								if( wvf > 0.221272 )
									ret := 0.017997
						if( upperBand > 1.92412 )
							if( midLine <= 1.40816 )
								if( Color_con1 <= -1.59155 )
									ret := 0.154185
								if( Color_con1 > -1.59155 )
									ret := 0.303443
							if( midLine > 1.40816 )
								if( Color_con2 <= -3.12533 )
									ret := 0.787879 // buy
								if( Color_con2 > -3.12533 )
									ret := -0.081425
					if( wvf > 0.851445 )
						if( Color_con2 <= -5.31472 )
							if( wvf <= 1.16931 )
								if( Color_con2 <= -5.75421 )
									ret := 0.684932
								if( Color_con2 > -5.75421 )
									ret := 0.000000
							if( wvf > 1.16931 )
								if( Color_con1 <= -0.99562 )
									ret := -0.636364
								if( Color_con1 > -0.99562 )
									ret := 0.076923
						if( Color_con2 > -5.31472 )
							if( Color_con1 <= -1.92166 )
								if( lowerBand <= 1.38019 )
									ret := -0.076923
								if( lowerBand > 1.38019 )
									ret := -0.558824
							if( Color_con1 > -1.92166 )
								if( Color_con1 <= -1.64343 )
									ret := 0.200000
								if( Color_con1 > -1.64343 )
									ret := -0.005821
				if( sDev > 1.13983 )
					if( lowerBand <= -0.200935 )
						if( upperBand <= 2.09475 )
							if( Color_con1 <= -1.46864 )
								if( wvf <= 0.446362 )
									ret := 0.012987
								if( wvf > 0.446362 )
									ret := 0.642857
							if( Color_con1 > -1.46864 )
								if( Color_con1 <= 0.116727 )
									ret := -0.253807
								if( Color_con1 > 0.116727 )
									ret := 0.112676
						if( upperBand > 2.09475 )
							if( Color_con1 <= 0.123839 )
								if( wvf <= 2.23374 )
									ret := -0.218891
								if( wvf > 2.23374 )
									ret := 0.354839
							if( Color_con1 > 0.123839 )
								if( midLine <= 0.820668 )
									ret := 0.500000
								if( midLine > 0.820668 )
									ret := -0.596154
					if( lowerBand > -0.200935 )
						if( Color_con1 <= 0.100849 )
							if( upperBand <= 3.29399 )
								if( upperBand <= 3.06841 )
									ret := -0.012457
								if( upperBand > 3.06841 )
									ret := -0.238447
							if( upperBand > 3.29399 )
								if( midLine <= 2.29414 )
									ret := 0.254355
								if( midLine > 2.29414 )
									ret := -0.027542
						if( Color_con1 > 0.100849 )
							if( midLine <= 1.1113 )
								if( Color_con1 <= 0.171869 )
									ret := -0.625000
								if( Color_con1 > 0.171869 )
									ret := 0.062500
							if( midLine > 1.1113 )
								if( wvf <= 2.56815 )
									ret := 0.000000
								if( wvf > 2.56815 )
									ret := 0.808511 // buy
			if( wvf > 2.76727 )
				if( sDev <= 1.09041 )
					if( wvf <= 2.89781 )
						if( midLine <= 2.60806 )
							if( wvf <= 2.86559 )
								if( Color_con1 <= -0.094225 )
									ret := 0.791667 // buy
								if( Color_con1 > -0.094225 )
									ret := 0.480000
							if( wvf > 2.86559 )
								if( sDev <= 1.01965 )
									ret := 0.571429
								if( sDev > 1.01965 )
									ret := -0.142857
						if( midLine > 2.60806 )
							if( upperBand <= 3.53338 )
								ret := -0.750000 // sell
							if( upperBand > 3.53338 )
								if( sDev <= 0.973086 )
									ret := 0.454545
								if( sDev > 0.973086 )
									ret := -0.166667
					if( wvf > 2.89781 )
						if( midLine <= 2.80385 )
							if( lowerBand <= 1.68571 )
								if( Color_con1 <= 0.707392 )
									ret := -0.276190
								if( Color_con1 > 0.707392 )
									ret := 0.526316
							if( lowerBand > 1.68571 )
								if( Color_con2 <= 0.06728 )
									ret := 0.333333
								if( Color_con2 > 0.06728 )
									ret := 0.937500 // buy
						if( midLine > 2.80385 )
							if( Color_con2 <= -0.718016 )
								if( lowerBand <= 2.54532 )
									ret := 0.714286 // buy
								if( lowerBand > 2.54532 )
									ret := -0.285714
							if( Color_con2 > -0.718016 )
								if( sDev <= 1.01192 )
									ret := -0.581818
								if( sDev > 1.01192 )
									ret := -0.100000
				if( sDev > 1.09041 )
					if( Color_con2 <= -0.087328 )
						if( midLine <= 1.0682 )
							if( upperBand <= 2.2226 )
								ret := 0.142857
							if( upperBand > 2.2226 )
								if( midLine <= 0.950509 )
									ret := -0.750000 // sell
								if( midLine > 0.950509 )
									ret := -1.000000 // sell
						if( midLine > 1.0682 )
							if( Color_con1 <= 0.178212 )
								if( midLine <= 3.69367 )
									ret := 0.262136
								if( midLine > 3.69367 )
									ret := 0.539683
							if( Color_con1 > 0.178212 )
								if( sDev <= 1.1776 )
									ret := 0.444444
								if( sDev > 1.1776 )
									ret := 0.970588 // buy
					if( Color_con2 > -0.087328 )
						if( Color_con2 <= 1.00377 )
							if( midLine <= 1.7642 )
								if( Color_con2 <= 0.507759 )
									ret := 0.240000
								if( Color_con2 > 0.507759 )
									ret := -0.640000
							if( midLine > 1.7642 )
								if( Color_con1 <= -0.057404 )
									ret := 0.051724
								if( Color_con1 > -0.057404 )
									ret := 0.682927
						if( Color_con2 > 1.00377 )
							if( Color_con2 <= 1.50793 )
								if( Color_con2 <= 1.32048 )
									ret := 0.554054
								if( Color_con2 > 1.32048 )
									ret := 0.878788 // buy
							if( Color_con2 > 1.50793 )
								if( sDev <= 1.16501 )
									ret := 0.727273 // buy
								if( sDev > 1.16501 )
									ret := 0.066667
		if( sDev > 1.34571 )
			if( midLine <= 10.8582 )
				if( lowerBand <= -0.676012 )
					if( wvf <= 6.17683 )
						if( Color_con1 <= -4.72739 )
							if( midLine <= 4.78391 )
								if( sDev <= 7.04534 )
									ret := -0.153343
								if( sDev > 7.04534 )
									ret := -0.818182 // sell
							if( midLine > 4.78391 )
								if( lowerBand <= -1.97805 )
									ret := 0.468531
								if( lowerBand > -1.97805 )
									ret := -0.165138
						if( Color_con1 > -4.72739 )
							if( Color_con2 <= 1.01086 )
								if( lowerBand <= -1.47931 )
									ret := 0.334615
								if( lowerBand > -1.47931 )
									ret := 0.025065
							if( Color_con2 > 1.01086 )
								if( Color_con2 <= 1.67388 )
									ret := -0.333333
								if( Color_con2 > 1.67388 )
									ret := -0.025974
					if( wvf > 6.17683 )
						if( lowerBand <= -1.90296 )
							if( lowerBand <= -4.33617 )
								if( upperBand <= 9.92487 )
									ret := 0.500000
								if( upperBand > 9.92487 )
									ret := 1.000000 // buy
							if( lowerBand > -4.33617 )
								if( Color_con2 <= 3.96907 )
									ret := -0.477011
								if( Color_con2 > 3.96907 )
									ret := 0.211765
						if( lowerBand > -1.90296 )
							if( midLine <= 5.497 )
								if( Color_con2 <= 2.34641 )
									ret := 0.418338
								if( Color_con2 > 2.34641 )
									ret := 0.009662
							if( midLine > 5.497 )
								if( midLine <= 6.60895 )
									ret := 0.910714 // buy
								if( midLine > 6.60895 )
									ret := -0.200000
				if( lowerBand > -0.676012 )
					if( lowerBand <= 2.39153 )
						if( wvf <= 8.07964 )
							if( wvf <= 6.09185 )
								if( sDev <= 1.72445 )
									ret := 0.105747
								if( sDev > 1.72445 )
									ret := 0.060217
							if( wvf > 6.09185 )
								if( midLine <= 4.85023 )
									ret := 0.308943
								if( midLine > 4.85023 )
									ret := 0.071429
						if( wvf > 8.07964 )
							if( upperBand <= 10.2874 )
								if( Color_con1 <= 0.24568 )
									ret := 0.289062
								if( Color_con1 > 0.24568 )
									ret := -0.532258
							if( upperBand > 10.2874 )
								if( upperBand <= 14.5631 )
									ret := -0.617347
								if( upperBand > 14.5631 )
									ret := 0.239130
					if( lowerBand > 2.39153 )
						if( Color_con2 <= 0.395081 )
							if( wvf <= 8.7588 )
								if( upperBand <= 16.5664 )
									ret := 0.143048
								if( upperBand > 16.5664 )
									ret := -0.727273 // sell
							if( wvf > 8.7588 )
								if( upperBand <= 11.4375 )
									ret := -1.000000 // sell
								if( upperBand > 11.4375 )
									ret := 0.753623 // buy
						if( Color_con2 > 0.395081 )
							if( lowerBand <= 4.42458 )
								if( midLine <= 6.07714 )
									ret := 0.525641
								if( midLine > 6.07714 )
									ret := 0.979167 // buy
							if( lowerBand > 4.42458 )
								if( sDev <= 3.04145 )
									ret := -0.250000
								if( sDev > 3.04145 )
									ret := -0.750000 // sell
			if( midLine > 10.8582 )
				if( upperBand <= 18.2195 )
					if( Color_con1 <= -11.2227 )
						ret := -0.500000
					if( Color_con1 > -11.2227 )
						if( Color_con1 <= -8.89197 )
							ret := -1.000000 // sell
						if( Color_con1 > -8.89197 )
							if( lowerBand <= 6.28604 )
								ret := -0.400000
							if( lowerBand > 6.28604 )
								ret := -1.000000 // sell
				if( upperBand > 18.2195 )
					if( Color_con1 <= -13.2862 )
						if( upperBand <= 23.9668 )
							if( midLine <= 14.5705 )
								if( midLine <= 11.2856 )
									ret := -0.571429
								if( midLine > 11.2856 )
									ret := -0.964912 // sell
							if( midLine > 14.5705 )
								ret := -0.250000
						if( upperBand > 23.9668 )
							if( lowerBand <= 4.45331 )
								if( Color_con2 <= -12.5948 )
									ret := 0.303030
								if( Color_con2 > -12.5948 )
									ret := -0.850000 // sell
							if( lowerBand > 4.45331 )
								ret := 1.000000 // buy
					if( Color_con1 > -13.2862 )
						if( sDev <= 5.90063 )
							ret := -0.400000
						if( sDev > 5.90063 )
							if( midLine <= 12.4549 )
								if( Color_con1 <= -10.9696 )
									ret := 1.000000 // buy
								if( Color_con1 > -10.9696 )
									ret := -0.400000
							if( midLine > 12.4549 )
								if( sDev <= 6.98159 )
									ret := 1.000000 // buy
								if( sDev > 6.98159 )
									ret := 0.800000 // buy
	if( wvf > 9.54561 )
		if( Color_con1 <= -10.7054 )
			if( Color_con2 <= -2.35324 )
				if( Color_con2 <= -6.97662 )
					if( lowerBand <= 6.93574 )
						ret := 0.500000
					if( lowerBand > 6.93574 )
						ret := 0.000000
				if( Color_con2 > -6.97662 )
					if( midLine <= 18.8579 )
						if( wvf <= 11.3273 )
							if( Color_con2 <= -6.69884 )
								if( wvf <= 10.3506 )
									ret := -1.000000 // sell
								if( wvf > 10.3506 )
									ret := -0.750000 // sell
							if( Color_con2 > -6.69884 )
								ret := -1.000000 // sell
						if( wvf > 11.3273 )
							if( upperBand <= 36.4988 )
								if( Color_con2 <= -4.36304 )
									ret := 0.200000
								if( Color_con2 > -4.36304 )
									ret := -0.750000 // sell
							if( upperBand > 36.4988 )
								ret := -1.000000 // sell
					if( midLine > 18.8579 )
						ret := 0.333333
			if( Color_con2 > -2.35324 )
				ret := 1.000000 // buy
		if( Color_con1 > -10.7054 )
			if( Color_con2 <= 6.61335 )
				if( Color_con2 <= 1.94211 )
					if( upperBand <= 14.9391 )
						if( lowerBand <= -1.536 )
							if( sDev <= 8.25705 )
								if( lowerBand <= -1.62803 )
									ret := -0.857143 // sell
								if( lowerBand > -1.62803 )
									ret := 0.166667
							if( sDev > 8.25705 )
								ret := 1.000000 // buy
						if( lowerBand > -1.536 )
							if( wvf <= 11.0931 )
								if( wvf <= 10.2296 )
									ret := 0.763636 // buy
								if( wvf > 10.2296 )
									ret := 0.395349
							if( wvf > 11.0931 )
								if( Color_con2 <= -3.35868 )
									ret := 0.400000
								if( Color_con2 > -3.35868 )
									ret := 1.000000 // buy
					if( upperBand > 14.9391 )
						if( lowerBand <= 3.39873 )
							if( lowerBand <= 2.04461 )
								if( Color_con1 <= -4.20215 )
									ret := 0.225806
								if( Color_con1 > -4.20215 )
									ret := -0.909091 // sell
							if( lowerBand > 2.04461 )
								if( upperBand <= 17.228 )
									ret := -0.928571 // sell
								if( upperBand > 17.228 )
									ret := -0.466667
						if( lowerBand > 3.39873 )
							if( sDev <= 4.77209 )
								ret := -1.000000 // sell
							if( sDev > 4.77209 )
								if( sDev <= 5.99538 )
									ret := 0.802083 // buy
								if( sDev > 5.99538 )
									ret := 0.348624
				if( Color_con2 > 1.94211 )
					if( wvf <= 11.1499 )
						if( upperBand <= 10.4368 )
							if( lowerBand <= 2.60701 )
								if( Color_con1 <= -0.077815 )
									ret := -1.000000 // sell
								if( Color_con1 > -0.077815 )
									ret := -0.115385
							if( lowerBand > 2.60701 )
								ret := 1.000000 // buy
						if( upperBand > 10.4368 )
							if( Color_con2 <= 3.322 )
								if( midLine <= 5.85834 )
									ret := -0.666667
								if( midLine > 5.85834 )
									ret := 0.625000
							if( Color_con2 > 3.322 )
								if( Color_con1 <= -1.39818 )
									ret := 0.413043
								if( Color_con1 > -1.39818 )
									ret := 0.900000 // buy
					if( wvf > 11.1499 )
						if( sDev <= 6.59933 )
							if( sDev <= 4.56381 )
								if( wvf <= 11.7751 )
									ret := -0.600000
								if( wvf > 11.7751 )
									ret := 0.900000 // buy
							if( sDev > 4.56381 )
								if( Color_con1 <= -2.1276 )
									ret := -0.920000 // sell
								if( Color_con1 > -2.1276 )
									ret := -0.425532
						if( sDev > 6.59933 )
							if( Color_con1 <= -2.24207 )
								if( lowerBand <= -0.243878 )
									ret := -0.639344
								if( lowerBand > -0.243878 )
									ret := 0.351852
							if( Color_con1 > -2.24207 )
								if( upperBand <= 13.5793 )
									ret := 0.043478
								if( upperBand > 13.5793 )
									ret := 0.802817 // buy
			if( Color_con2 > 6.61335 )
				if( Color_con1 <= 3.64001 )
					if( sDev <= 7.32503 )
						if( Color_con2 <= 7.52041 )
							if( upperBand <= 9.76034 )
								if( upperBand <= 8.5387 )
									ret := 0.500000
								if( upperBand > 8.5387 )
									ret := 1.000000 // buy
							if( upperBand > 9.76034 )
								if( midLine <= 4.89785 )
									ret := 0.000000
								if( midLine > 4.89785 )
									ret := 0.777778 // buy
						if( Color_con2 > 7.52041 )
							if( wvf <= 14.7487 )
								if( lowerBand <= -2.72635 )
									ret := -0.833333 // sell
								if( lowerBand > -2.72635 )
									ret := 0.388889
							if( wvf > 14.7487 )
								ret := -1.000000 // sell
					if( sDev > 7.32503 )
						if( midLine <= 8.91097 )
							if( wvf <= 11.6277 )
								ret := -0.250000
							if( wvf > 11.6277 )
								if( wvf <= 15.3918 )
									ret := 0.750000 // buy
								if( wvf > 15.3918 )
									ret := 0.980392 // buy
						if( midLine > 8.91097 )
							if( lowerBand <= -0.927033 )
								if( sDev <= 11.8233 )
									ret := -0.833333 // sell
								if( sDev > 11.8233 )
									ret := 0.600000
							if( lowerBand > -0.927033 )
								if( upperBand <= 20.1653 )
									ret := 0.750000 // buy
								if( upperBand > 20.1653 )
									ret := 1.000000 // buy
				if( Color_con1 > 3.64001 )
					if( Color_con2 <= 13.3555 )
						ret := 1.000000 // buy
					if( Color_con2 > 13.3555 )
						if( upperBand <= 27.0359 )
							ret := -0.250000
						if( upperBand > 27.0359 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_ETHUSDT_30Min_216dda3b(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


