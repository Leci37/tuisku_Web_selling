//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: BABA_30Min_1WIL_865de44a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_1WIL_865de44a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_865de44a(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( midLine <= 4.17306 )
		if( Color_con2 <= -4.46854 )
			if( lowerBand <= -2.75672 )
				if( sDev <= 5.39869 )
					if( lowerBand <= -2.79157 )
						if( Color_con1 <= -5.95833 )
							ret := 1.000000 // buy
						if( Color_con1 > -5.95833 )
							ret := 0.750000 // buy
					if( lowerBand > -2.79157 )
						ret := 0.500000
				if( sDev > 5.39869 )
					if( Color_con2 <= -7.89134 )
						ret := -0.857143 // sell
					if( Color_con2 > -7.89134 )
						if( Color_con2 <= -6.46618 )
							if( wvf <= 0.469935 )
								ret := 0.333333
							if( wvf > 0.469935 )
								ret := 1.000000 // buy
						if( Color_con2 > -6.46618 )
							if( lowerBand <= -3.09241 )
								ret := 0.000000
							if( lowerBand > -3.09241 )
								ret := -0.833333 // sell
			if( lowerBand > -2.75672 )
				if( Color_con1 <= -8.95246 )
					if( Color_con1 <= -9.13604 )
						if( wvf <= 0.774868 )
							ret := -0.500000
						if( wvf > 0.774868 )
							ret := -1.000000 // sell
					if( Color_con1 > -9.13604 )
						ret := -1.000000 // sell
				if( Color_con1 > -8.95246 )
					if( lowerBand <= -0.614447 )
						if( upperBand <= 4.65871 )
							if( sDev <= 2.30321 )
								if( wvf <= 1.23376 )
									ret := 0.373626
								if( wvf > 1.23376 )
									ret := -0.272727
							if( sDev > 2.30321 )
								if( Color_con2 <= -4.66047 )
									ret := 0.753333 // buy
								if( Color_con2 > -4.66047 )
									ret := -0.416667
						if( upperBand > 4.65871 )
							if( midLine <= 1.95936 )
								if( Color_con1 <= -5.11606 )
									ret := 0.222222
								if( Color_con1 > -5.11606 )
									ret := -0.487179
							if( midLine > 1.95936 )
								if( Color_con1 <= -8.23262 )
									ret := 0.636364
								if( Color_con1 > -8.23262 )
									ret := 0.168675
					if( lowerBand > -0.614447 )
						if( upperBand <= 2.22625 )
							if( sDev <= 0.622339 )
								if( lowerBand <= -0.107783 )
									ret := -0.705882 // sell
								if( lowerBand > -0.107783 )
									ret := 0.059829
							if( sDev > 0.622339 )
								if( lowerBand <= -0.283343 )
									ret := 0.017241
								if( lowerBand > -0.283343 )
									ret := 0.443750
						if( upperBand > 2.22625 )
							if( wvf <= 1.142 )
								if( sDev <= 2.53017 )
									ret := -0.307065
								if( sDev > 2.53017 )
									ret := 0.201220
							if( wvf > 1.142 )
								if( sDev <= 3.04578 )
									ret := 0.354922
								if( sDev > 3.04578 )
									ret := -0.351351
		if( Color_con2 > -4.46854 )
			if( Color_con2 <= -3.02578 )
				if( sDev <= 2.95488 )
					if( sDev <= 1.62702 )
						if( upperBand <= 3.43633 )
							if( Color_con2 <= -3.79694 )
								if( lowerBand <= -0.408429 )
									ret := 0.673469
								if( lowerBand > -0.408429 )
									ret := 0.069767
							if( Color_con2 > -3.79694 )
								if( midLine <= 0.55932 )
									ret := -0.358268
								if( midLine > 0.55932 )
									ret := -0.039046
						if( upperBand > 3.43633 )
							if( upperBand <= 3.98106 )
								if( Color_con2 <= -3.31212 )
									ret := 0.909091 // buy
								if( Color_con2 > -3.31212 )
									ret := 0.363636
							if( upperBand > 3.98106 )
								if( lowerBand <= 1.74621 )
									ret := 0.000000
								if( lowerBand > 1.74621 )
									ret := 0.666667
					if( sDev > 1.62702 )
						if( wvf <= 3.13866 )
							if( sDev <= 2.51872 )
								if( midLine <= 1.41149 )
									ret := -0.131387
								if( midLine > 1.41149 )
									ret := -0.419441
							if( sDev > 2.51872 )
								if( wvf <= 0.667461 )
									ret := -0.008197
								if( wvf > 0.667461 )
									ret := -0.264822
						if( wvf > 3.13866 )
							if( Color_con2 <= -3.78002 )
								ret := 0.250000
							if( Color_con2 > -3.78002 )
								if( lowerBand <= -0.412829 )
									ret := 0.750000 // buy
								if( lowerBand > -0.412829 )
									ret := 1.000000 // buy
				if( sDev > 2.95488 )
					if( wvf <= 1.60136 )
						if( Color_con1 <= -5.99417 )
							if( wvf <= 1.11856 )
								if( upperBand <= 7.10177 )
									ret := -0.269231
								if( upperBand > 7.10177 )
									ret := -0.822222 // sell
							if( wvf > 1.11856 )
								if( sDev <= 3.79445 )
									ret := 1.000000 // buy
								if( sDev > 3.79445 )
									ret := 0.500000
						if( Color_con1 > -5.99417 )
							if( midLine <= 2.40555 )
								if( wvf <= 1.30764 )
									ret := -0.085366
								if( wvf > 1.30764 )
									ret := -0.809524 // sell
							if( midLine > 2.40555 )
								if( Color_con2 <= -3.95349 )
									ret := 0.636364
								if( Color_con2 > -3.95349 )
									ret := 0.158103
					if( wvf > 1.60136 )
						if( Color_con2 <= -3.39887 )
							if( lowerBand <= -0.969216 )
								if( Color_con2 <= -4.20634 )
									ret := 0.000000
								if( Color_con2 > -4.20634 )
									ret := 0.867925 // buy
							if( lowerBand > -0.969216 )
								if( midLine <= 2.4396 )
									ret := -0.750000 // sell
								if( midLine > 2.4396 )
									ret := 0.457627
						if( Color_con2 > -3.39887 )
							if( sDev <= 3.06577 )
								if( wvf <= 3.28892 )
									ret := 0.750000 // buy
								if( wvf > 3.28892 )
									ret := 1.000000 // buy
							if( sDev > 3.06577 )
								if( midLine <= 3.16418 )
									ret := -0.631579
								if( midLine > 3.16418 )
									ret := 0.600000
			if( Color_con2 > -3.02578 )
				if( midLine <= 3.52955 )
					if( Color_con2 <= -1.81169 )
						if( midLine <= 1.32563 )
							if( midLine <= 0.334642 )
								if( Color_con2 <= -1.88707 )
									ret := -0.222222
								if( Color_con2 > -1.88707 )
									ret := 0.514286
							if( midLine > 0.334642 )
								if( sDev <= 2.47797 )
									ret := 0.163359
								if( sDev > 2.47797 )
									ret := 0.767442 // buy
						if( midLine > 1.32563 )
							if( Color_con2 <= -2.44055 )
								if( lowerBand <= -0.232986 )
									ret := -0.124287
								if( lowerBand > -0.232986 )
									ret := 0.035794
							if( Color_con2 > -2.44055 )
								if( wvf <= 2.59568 )
									ret := 0.125130
								if( wvf > 2.59568 )
									ret := -0.268421
					if( Color_con2 > -1.81169 )
						if( Color_con1 <= -2.91918 )
							if( midLine <= 1.34014 )
								if( sDev <= 2.03462 )
									ret := -0.200000
								if( sDev > 2.03462 )
									ret := -0.900000 // sell
							if( midLine > 1.34014 )
								if( upperBand <= 6.75386 )
									ret := -0.056645
								if( upperBand > 6.75386 )
									ret := -0.560440
						if( Color_con1 > -2.91918 )
							if( upperBand <= 4.16462 )
								if( sDev <= 1.92522 )
									ret := 0.039141
								if( sDev > 1.92522 )
									ret := -0.074343
							if( upperBand > 4.16462 )
								if( sDev <= 1.69261 )
									ret := 0.261201
								if( sDev > 1.69261 )
									ret := 0.079498
				if( midLine > 3.52955 )
					if( Color_con2 <= -2.4008 )
						if( upperBand <= 6.71878 )
							if( sDev <= 2.36098 )
								if( lowerBand <= 1.33981 )
									ret := 0.285714
								if( lowerBand > 1.33981 )
									ret := -0.481481
							if( sDev > 2.36098 )
								if( sDev <= 2.76241 )
									ret := -0.933333 // sell
								if( sDev > 2.76241 )
									ret := 0.000000
						if( upperBand > 6.71878 )
							if( wvf <= 1.56464 )
								ret := -1.000000 // sell
							if( wvf > 1.56464 )
								if( lowerBand <= 1.21062 )
									ret := 0.750000 // buy
								if( lowerBand > 1.21062 )
									ret := 0.250000
					if( Color_con2 > -2.4008 )
						if( wvf <= 3.14096 )
							if( lowerBand <= 2.02334 )
								if( midLine <= 4.01049 )
									ret := -0.061728
								if( midLine > 4.01049 )
									ret := -0.625000
							if( lowerBand > 2.02334 )
								if( sDev <= 1.69074 )
									ret := 0.288732
								if( sDev > 1.69074 )
									ret := 0.900000 // buy
						if( wvf > 3.14096 )
							if( lowerBand <= 0.530675 )
								if( wvf <= 6.17414 )
									ret := 0.341615
								if( wvf > 6.17414 )
									ret := -0.183486
							if( lowerBand > 0.530675 )
								if( lowerBand <= 3.07519 )
									ret := -0.180672
								if( lowerBand > 3.07519 )
									ret := -0.888889 // sell
	if( midLine > 4.17306 )
		if( upperBand <= 9.2366 )
			if( Color_con1 <= -5.56602 )
				if( sDev <= 3.54145 )
					if( wvf <= 1.73152 )
						if( Color_con2 <= -3.93077 )
							if( midLine <= 4.70479 )
								if( midLine <= 4.22441 )
									ret := 0.000000
								if( midLine > 4.22441 )
									ret := -0.774194 // sell
							if( midLine > 4.70479 )
								if( lowerBand <= 1.84956 )
									ret := 1.000000 // buy
								if( lowerBand > 1.84956 )
									ret := -0.235294
						if( Color_con2 > -3.93077 )
							if( upperBand <= 7.22107 )
								ret := 0.400000
							if( upperBand > 7.22107 )
								ret := 1.000000 // buy
					if( wvf > 1.73152 )
						if( Color_con2 <= -4.01342 )
							if( midLine <= 6.11078 )
								if( sDev <= 2.72209 )
									ret := -0.750000 // sell
								if( sDev > 2.72209 )
									ret := -0.956522 // sell
							if( midLine > 6.11078 )
								ret := 0.000000
						if( Color_con2 > -4.01342 )
							if( lowerBand <= 2.04342 )
								ret := 0.333333
							if( lowerBand > 2.04342 )
								if( upperBand <= 8.63126 )
									ret := -0.888889 // sell
								if( upperBand > 8.63126 )
									ret := 0.000000
				if( sDev > 3.54145 )
					if( Color_con1 <= -7.74897 )
						if( Color_con2 <= -5.67859 )
							ret := -1.000000 // sell
						if( Color_con2 > -5.67859 )
							if( sDev <= 4.09086 )
								if( wvf <= 0.657231 )
									ret := -0.250000
								if( wvf > 0.657231 )
									ret := -0.750000 // sell
							if( sDev > 4.09086 )
								if( Color_con1 <= -8.1071 )
									ret := 0.250000
								if( Color_con1 > -8.1071 )
									ret := -0.500000
					if( Color_con1 > -7.74897 )
						if( Color_con1 <= -6.40129 )
							if( upperBand <= 8.28063 )
								if( wvf <= 0.99878 )
									ret := 0.666667
								if( wvf > 0.99878 )
									ret := 1.000000 // buy
							if( upperBand > 8.28063 )
								if( upperBand <= 8.51902 )
									ret := -0.285714
								if( upperBand > 8.51902 )
									ret := 0.540541
						if( Color_con1 > -6.40129 )
							if( Color_con2 <= -5.11005 )
								ret := -1.000000 // sell
							if( Color_con2 > -5.11005 )
								if( midLine <= 4.56923 )
									ret := 0.727273 // buy
								if( midLine > 4.56923 )
									ret := -0.272727
			if( Color_con1 > -5.56602 )
				if( Color_con1 <= -4.55741 )
					if( sDev <= 3.1404 )
						if( upperBand <= 8.62448 )
							if( Color_con2 <= -4.43278 )
								if( upperBand <= 7.15021 )
									ret := 0.500000
								if( upperBand > 7.15021 )
									ret := 1.000000 // buy
							if( Color_con2 > -4.43278 )
								if( upperBand <= 6.88073 )
									ret := 0.818182 // buy
								if( upperBand > 6.88073 )
									ret := -0.031250
						if( upperBand > 8.62448 )
							if( wvf <= 3.83957 )
								if( wvf <= 3.47795 )
									ret := 0.750000 // buy
								if( wvf > 3.47795 )
									ret := 1.000000 // buy
							if( wvf > 3.83957 )
								ret := 0.600000
					if( sDev > 3.1404 )
						if( Color_con1 <= -5.42882 )
							if( sDev <= 3.93239 )
								ret := -0.750000 // sell
							if( sDev > 3.93239 )
								ret := 0.750000 // buy
						if( Color_con1 > -5.42882 )
							if( upperBand <= 8.00137 )
								if( sDev <= 3.33841 )
									ret := 0.250000
								if( sDev > 3.33841 )
									ret := 1.000000 // buy
							if( upperBand > 8.00137 )
								if( Color_con1 <= -5.30893 )
									ret := 0.750000 // buy
								if( Color_con1 > -5.30893 )
									ret := 1.000000 // buy
				if( Color_con1 > -4.55741 )
					if( Color_con1 <= -3.4078 )
						if( lowerBand <= 3.05571 )
							if( wvf <= 3.00474 )
								if( Color_con2 <= -2.62938 )
									ret := -0.107143
								if( Color_con2 > -2.62938 )
									ret := 0.457143
							if( wvf > 3.00474 )
								if( Color_con2 <= -1.49585 )
									ret := -0.359155
								if( Color_con2 > -1.49585 )
									ret := 0.156250
						if( lowerBand > 3.05571 )
							if( Color_con1 <= -3.66571 )
								if( upperBand <= 7.25189 )
									ret := 0.000000
								if( upperBand > 7.25189 )
									ret := 0.756757 // buy
							if( Color_con1 > -3.66571 )
								if( lowerBand <= 3.28018 )
									ret := -0.666667
								if( lowerBand > 3.28018 )
									ret := 0.000000
					if( Color_con1 > -3.4078 )
						if( sDev <= 4.11227 )
							if( Color_con1 <= -2.4152 )
								if( Color_con2 <= -1.89676 )
									ret := 0.052632
								if( Color_con2 > -1.89676 )
									ret := 0.551095
							if( Color_con1 > -2.4152 )
								if( Color_con2 <= -1.15889 )
									ret := -0.378378
								if( Color_con2 > -1.15889 )
									ret := 0.297587
						if( sDev > 4.11227 )
							if( Color_con2 <= 4.98616 )
								if( lowerBand <= 0.093473 )
									ret := 1.000000 // buy
								if( lowerBand > 0.093473 )
									ret := 0.733333 // buy
							if( Color_con2 > 4.98616 )
								ret := 0.000000
		if( upperBand > 9.2366 )
			if( Color_con2 <= 4.17417 )
				if( sDev <= 3.25514 )
					if( lowerBand <= 3.92893 )
						if( midLine <= 6.47753 )
							ret := 0.750000 // buy
						if( midLine > 6.47753 )
							ret := 1.000000 // buy
					if( lowerBand > 3.92893 )
						if( Color_con1 <= -1.79578 )
							if( Color_con1 <= -3.47966 )
								if( Color_con1 <= -3.79852 )
									ret := -0.526316
								if( Color_con1 > -3.79852 )
									ret := 0.750000 // buy
							if( Color_con1 > -3.47966 )
								if( sDev <= 1.88786 )
									ret := -0.250000
								if( sDev > 1.88786 )
									ret := -0.968750 // sell
						if( Color_con1 > -1.79578 )
							ret := 0.200000
				if( sDev > 3.25514 )
					if( Color_con1 <= -2.40741 )
						if( Color_con1 <= -3.17057 )
							if( upperBand <= 19.1733 )
								if( Color_con2 <= -7.19212 )
									ret := -0.398374
								if( Color_con2 > -7.19212 )
									ret := 0.088681
							if( upperBand > 19.1733 )
								if( Color_con2 <= 1.90797 )
									ret := 0.818182 // buy
								if( Color_con2 > 1.90797 )
									ret := -0.250000
						if( Color_con1 > -3.17057 )
							if( sDev <= 6.20174 )
								if( wvf <= 7.04687 )
									ret := -0.892857 // sell
								if( wvf > 7.04687 )
									ret := -0.494253
							if( sDev > 6.20174 )
								if( Color_con2 <= 2.37715 )
									ret := 0.307692
								if( Color_con2 > 2.37715 )
									ret := -0.818182 // sell
					if( Color_con1 > -2.40741 )
						if( wvf <= 10.3337 )
							if( sDev <= 4.92043 )
								if( colInt <= 0.5 )
									ret := 1.000000 // buy
								if( colInt > 0.5 )
									ret := 0.139535
							if( sDev > 4.92043 )
								if( upperBand <= 12.2425 )
									ret := 0.886364 // buy
								if( upperBand > 12.2425 )
									ret := 0.250000
						if( wvf > 10.3337 )
							if( midLine <= 7.84274 )
								if( Color_con1 <= -1.52542 )
									ret := -0.600000
								if( Color_con1 > -1.52542 )
									ret := 0.800000 // buy
							if( midLine > 7.84274 )
								ret := -1.000000 // sell
			if( Color_con2 > 4.17417 )
				if( lowerBand <= -2.64749 )
					if( upperBand <= 18.7059 )
						ret := -0.500000
					if( upperBand > 18.7059 )
						ret := 1.000000 // buy
				if( lowerBand > -2.64749 )
					if( Color_con2 <= 4.43725 )
						ret := 0.750000 // buy
					if( Color_con2 > 4.43725 )
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
float op_operation = decision_tree_0_BABA_30Min_865de44a(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


