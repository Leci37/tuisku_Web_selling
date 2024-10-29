//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SNOW_1Min_2BS0_bef6b78f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2BS0_bef6b78f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_bef6b78f(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.014709 )
		if( k <= 84.6478 )
			if( rsi1 <= 14.7368 )
				if( smoothD_d <= 55.8501 )
					if( bbm <= 0.118769 )
						if( bbp <= -0.639664 )
							if( smoothK_k <= 1.52847 )
								if( d <= 4.04034 )
									ret := 0.275862
								if( d > 4.04034 )
									ret := -0.714286 // sell
							if( smoothK_k > 1.52847 )
								if( bullPower <= -0.33892 )
									ret := 0.800000 // buy
								if( bullPower > -0.33892 )
									ret := 0.454545
						if( bbp > -0.639664 )
							if( smoothK_k <= -2.87581 )
								if( smoothK_k <= -2.99948 )
									ret := -0.314286
								if( smoothK_k > -2.99948 )
									ret := -0.791667 // sell
							if( smoothK_k > -2.87581 )
								if( d_k <= 4.66467 )
									ret := 0.029630
								if( d_k > 4.66467 )
									ret := -0.457143
					if( bbm > 0.118769 )
						if( bearPower <= -5.08211 )
							ret := -1.000000 // sell
						if( bearPower > -5.08211 )
							if( rsi1 <= 9.84291 )
								if( smoothD_d <= 0.29859 )
									ret := -0.167331
								if( smoothD_d > 0.29859 )
									ret := 0.580645
							if( rsi1 > 9.84291 )
								if( d_k <= 22.4268 )
									ret := -0.295290
								if( d_k > 22.4268 )
									ret := 0.818182 // buy
				if( smoothD_d > 55.8501 )
					if( rsi1 <= 10.6329 )
						ret := 0.125000
					if( rsi1 > 10.6329 )
						ret := 1.000000 // buy
			if( rsi1 > 14.7368 )
				if( k <= 47.8305 )
					if( bullPower <= -0.388312 )
						if( bbm <= 0.129344 )
							if( bearPower <= -0.959825 )
								if( k <= 1.05299 )
									ret := -0.823529 // sell
								if( k > 1.05299 )
									ret := 0.150000
							if( bearPower > -0.959825 )
								if( smoothD_d <= 57.2401 )
									ret := 0.417969
								if( smoothD_d > 57.2401 )
									ret := -0.545455
						if( bbm > 0.129344 )
							if( d_k <= 3.31327 )
								if( smoothD_d <= 11.0994 )
									ret := 0.131403
								if( smoothD_d > 11.0994 )
									ret := 0.625850
							if( d_k > 3.31327 )
								if( smoothK_k <= -2.9971 )
									ret := 0.714286 // buy
								if( smoothK_k > -2.9971 )
									ret := -0.106132
					if( bullPower > -0.388312 )
						if( smoothK_k <= 29.577 )
							if( bbm <= 0.210604 )
								if( bullPower <= -0.201442 )
									ret := 0.119654
								if( bullPower > -0.201442 )
									ret := 0.006439
							if( bbm > 0.210604 )
								if( smoothD_d <= -0.958424 )
									ret := -0.096386
								if( smoothD_d > -0.958424 )
									ret := 0.131240
						if( smoothK_k > 29.577 )
							if( bbp <= -0.323568 )
								if( rsi1 <= 28.1995 )
									ret := -0.438776
								if( rsi1 > 28.1995 )
									ret := -0.040748
							if( bbp > -0.323568 )
								if( d <= 66.5468 )
									ret := -0.008128
								if( d > 66.5468 )
									ret := 0.251852
				if( k > 47.8305 )
					if( smoothD_d <= 82.202 )
						if( bullPower <= -0.130944 )
							if( d_k <= -21.9546 )
								if( d_k <= -27.3903 )
									ret := -0.769231 // sell
								if( d_k > -27.3903 )
									ret := -0.159091
							if( d_k > -21.9546 )
								if( d_k <= 22.3532 )
									ret := 0.240847
								if( d_k > 22.3532 )
									ret := 0.914286 // buy
						if( bullPower > -0.130944 )
							if( d <= 82.8672 )
								if( bullPower <= 0.307904 )
									ret := 0.078426
								if( bullPower > 0.307904 )
									ret := -0.846154 // sell
							if( d > 82.8672 )
								if( bearPower <= -0.290345 )
									ret := -0.724138 // sell
								if( bearPower > -0.290345 )
									ret := -0.123134
					if( smoothD_d > 82.202 )
						if( bbm <= 0.788606 )
							if( rsi1 <= 49.6361 )
								if( bearPower <= -0.333307 )
									ret := 0.747059 // buy
								if( bearPower > -0.333307 )
									ret := 0.327103
							if( rsi1 > 49.6361 )
								if( rsi1 <= 58.8243 )
									ret := -0.119469
								if( rsi1 > 58.8243 )
									ret := 0.337662
						if( bbm > 0.788606 )
							ret := -0.789474 // sell
		if( k > 84.6478 )
			if( smoothD_d <= 76.5588 )
				if( bearPower <= -0.841975 )
					ret := 0.857143 // buy
				if( bearPower > -0.841975 )
					if( bbp <= -0.893106 )
						ret := -1.000000 // sell
					if( bbp > -0.893106 )
						if( d_k <= -16.5887 )
							if( smoothK_k <= 85.19 )
								if( rsi1 <= 32.1678 )
									ret := 0.000000
								if( rsi1 > 32.1678 )
									ret := -0.676190
							if( smoothK_k > 85.19 )
								if( smoothK_k <= 88.2638 )
									ret := 0.111111
								if( smoothK_k > 88.2638 )
									ret := -0.460526
						if( d_k > -16.5887 )
							if( bbm <= 0.017854 )
								ret := 0.631579
							if( bbm > 0.017854 )
								if( d_k <= -15.0262 )
									ret := 0.411765
								if( d_k > -15.0262 )
									ret := -0.371951
			if( smoothD_d > 76.5588 )
				if( d <= 81.2452 )
					if( k <= 91.5668 )
						if( bbp <= -0.06936 )
							if( bullPower <= -0.01907 )
								if( bbp <= -0.252682 )
									ret := 0.222222
								if( bbp > -0.252682 )
									ret := 0.560000
							if( bullPower > -0.01907 )
								ret := -0.740741 // sell
						if( bbp > -0.06936 )
							ret := 0.600000
					if( k > 91.5668 )
						if( bearPower <= -0.168811 )
							if( smoothK_k <= 92.0243 )
								if( d_k <= -12.1442 )
									ret := 1.000000 // buy
								if( d_k > -12.1442 )
									ret := 0.909091 // buy
							if( smoothK_k > 92.0243 )
								ret := 0.666667
						if( bearPower > -0.168811 )
							if( smoothK_k <= 91.012 )
								ret := 0.888889 // buy
							if( smoothK_k > 91.012 )
								if( bullPower <= 0.007205 )
									ret := 0.642857
								if( bullPower > 0.007205 )
									ret := -0.500000
				if( d > 81.2452 )
					if( bbm <= 0.099633 )
						if( d_k <= -8.32643 )
							if( rsi1 <= 42.4599 )
								if( bbm <= 0.047938 )
									ret := -0.909091 // sell
								if( bbm > 0.047938 )
									ret := -0.560000
							if( rsi1 > 42.4599 )
								if( smoothD_d <= 79.2012 )
									ret := -0.785714 // sell
								if( smoothD_d > 79.2012 )
									ret := 0.127660
						if( d_k > -8.32643 )
							if( bullPower <= -0.141597 )
								if( smoothK_k <= 88.2629 )
									ret := 0.810811 // buy
								if( smoothK_k > 88.2629 )
									ret := 0.469388
							if( bullPower > -0.141597 )
								if( k <= 85.4669 )
									ret := -0.264151
								if( k > 85.4669 )
									ret := 0.139503
					if( bbm > 0.099633 )
						if( d <= 98.1595 )
							if( d <= 97.4466 )
								if( bearPower <= -0.145658 )
									ret := -0.191723
								if( bearPower > -0.145658 )
									ret := 0.051339
							if( d > 97.4466 )
								if( bbp <= -0.227439 )
									ret := -0.294118
								if( bbp > -0.227439 )
									ret := 0.777778 // buy
						if( d > 98.1595 )
							if( bearPower <= -0.245014 )
								if( d <= 98.7575 )
									ret := -1.000000 // sell
								if( d > 98.7575 )
									ret := -0.702703 // sell
							if( bearPower > -0.245014 )
								if( bbp <= -0.15363 )
									ret := 0.062500
								if( bbp > -0.15363 )
									ret := -0.480000
	if( bbp > -0.014709 )
		if( smoothD_d <= 72.3366 )
			if( bbm <= 0.022534 )
				if( bbp <= 0.292018 )
					if( rsi1 <= 69.5575 )
						if( smoothK_k <= 20.8175 )
							if( d_k <= 15.8741 )
								if( smoothD_d <= 1.47226 )
									ret := 0.241758
								if( smoothD_d > 1.47226 )
									ret := -0.069903
							if( d_k > 15.8741 )
								if( rsi1 <= 58.0959 )
									ret := 0.400000
								if( rsi1 > 58.0959 )
									ret := 0.000000
						if( smoothK_k > 20.8175 )
							if( rsi1 <= 63.8684 )
								if( k <= 87.8352 )
									ret := -0.119324
								if( k > 87.8352 )
									ret := 0.481481
							if( rsi1 > 63.8684 )
								if( bearPower <= 0.124253 )
									ret := -0.457364
								if( bearPower > 0.124253 )
									ret := 0.050000
					if( rsi1 > 69.5575 )
						if( smoothD_d <= 61.3949 )
							if( d <= 62.6741 )
								if( bearPower <= 0.068619 )
									ret := 0.166667
								if( bearPower > 0.068619 )
									ret := 0.500000
							if( d > 62.6741 )
								ret := 1.000000 // buy
						if( smoothD_d > 61.3949 )
							if( bbp <= 0.179242 )
								ret := 0.285714
							if( bbp > 0.179242 )
								ret := -0.500000
				if( bbp > 0.292018 )
					if( smoothK_k <= 57.4681 )
						if( d <= 58.0839 )
							if( smoothD_d <= 49.5883 )
								if( k <= 3.61063 )
									ret := 0.076923
								if( k > 3.61063 )
									ret := -0.514950
							if( smoothD_d > 49.5883 )
								if( d_k <= -1.41008 )
									ret := -1.000000 // sell
								if( d_k > -1.41008 )
									ret := -0.737500 // sell
						if( d > 58.0839 )
							if( smoothK_k <= 44.5851 )
								ret := 0.619048
							if( smoothK_k > 44.5851 )
								if( d_k <= 4.61452 )
									ret := -0.714286 // sell
								if( d_k > 4.61452 )
									ret := -0.138889
					if( smoothK_k > 57.4681 )
						if( rsi1 <= 52.9036 )
							if( smoothD_d <= 58.9228 )
								if( d <= 59.3188 )
									ret := 0.083333
								if( d > 59.3188 )
									ret := 1.000000 // buy
							if( smoothD_d > 58.9228 )
								if( d_k <= -11.1842 )
									ret := 0.714286 // buy
								if( d_k > -11.1842 )
									ret := -0.333333
						if( rsi1 > 52.9036 )
							if( d <= 69.9901 )
								if( smoothD_d <= 56.8079 )
									ret := -0.090909
								if( smoothD_d > 56.8079 )
									ret := -0.510204
							if( d > 69.9901 )
								if( smoothK_k <= 89.6179 )
									ret := -0.195402
								if( smoothK_k > 89.6179 )
									ret := 0.777778 // buy
			if( bbm > 0.022534 )
				if( k <= 3.54112 )
					if( bullPower <= 0.200101 )
						if( BBPower_Color <= 0.5 )
							if( smoothD_d <= 8.42917 )
								if( d <= 6.57478 )
									ret := 0.342282
								if( d > 6.57478 )
									ret := 0.897436 // buy
							if( smoothD_d > 8.42917 )
								if( k <= 0.300397 )
									ret := 0.086957
								if( k > 0.300397 )
									ret := -0.807692 // sell
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 48.2624 )
								if( smoothD_d <= -2.32751 )
									ret := 0.600000
								if( smoothD_d > -2.32751 )
									ret := 0.015038
							if( rsi1 > 48.2624 )
								if( smoothD_d <= 4.24778 )
									ret := -0.293532
								if( smoothD_d > 4.24778 )
									ret := 0.212121
					if( bullPower > 0.200101 )
						if( bearPower <= 0.047801 )
							if( bbp <= 0.254551 )
								if( d <= 17.1208 )
									ret := 0.272727
								if( d > 17.1208 )
									ret := 0.937500 // buy
							if( bbp > 0.254551 )
								if( d <= 5.4563 )
									ret := 0.136364
								if( d > 5.4563 )
									ret := -0.900000 // sell
						if( bearPower > 0.047801 )
							if( d <= 0.494816 )
								ret := -0.454545
							if( d > 0.494816 )
								if( bbp <= 0.525083 )
									ret := 0.529412
								if( bbp > 0.525083 )
									ret := 0.885714 // buy
				if( k > 3.54112 )
					if( bullPower <= 0.890642 )
						if( smoothK_k <= 89.7362 )
							if( bbp <= 0.036213 )
								if( d <= 63.1181 )
									ret := 0.000000
								if( d > 63.1181 )
									ret := 0.153465
							if( bbp > 0.036213 )
								if( d_k <= -31.906 )
									ret := -0.769231 // sell
								if( d_k > -31.906 )
									ret := -0.067974
						if( smoothK_k > 89.7362 )
							if( bearPower <= 0.00183 )
								if( bullPower <= 0.120531 )
									ret := 0.142857
								if( bullPower > 0.120531 )
									ret := -0.666667
							if( bearPower > 0.00183 )
								if( bbp <= 0.942561 )
									ret := 0.408511
								if( bbp > 0.942561 )
									ret := -0.423077
					if( bullPower > 0.890642 )
						if( k <= 43.1248 )
							if( smoothK_k <= 19.483 )
								if( bbm <= 1.2947 )
									ret := 0.647059
								if( bbm > 1.2947 )
									ret := -0.846154 // sell
							if( smoothK_k > 19.483 )
								if( bullPower <= 0.981892 )
									ret := -0.785714 // sell
								if( bullPower > 0.981892 )
									ret := -1.000000 // sell
						if( k > 43.1248 )
							if( smoothK_k <= 56.6747 )
								if( d_k <= -3.32386 )
									ret := 0.878788 // buy
								if( d_k > -3.32386 )
									ret := -0.296296
							if( smoothK_k > 56.6747 )
								if( d <= 50.6651 )
									ret := -0.807018 // sell
								if( d > 50.6651 )
									ret := -0.285714
		if( smoothD_d > 72.3366 )
			if( rsi1 <= 92.4305 )
				if( d <= 79.9015 )
					if( k <= 59.7331 )
						if( d_k <= 25.2178 )
							if( bullPower <= 0.235967 )
								if( smoothK_k <= 52.4669 )
									ret := 0.333333
								if( smoothK_k > 52.4669 )
									ret := 0.800000 // buy
							if( bullPower > 0.235967 )
								if( k <= 55.0231 )
									ret := 1.000000 // buy
								if( k > 55.0231 )
									ret := -0.300000
						if( d_k > 25.2178 )
							ret := -0.318182
					if( k > 59.7331 )
						if( d_k <= 16.1665 )
							if( bullPower <= 0.131696 )
								if( bullPower <= 0.109753 )
									ret := 0.005025
								if( bullPower > 0.109753 )
									ret := -0.256281
							if( bullPower > 0.131696 )
								if( bearPower <= 0.273119 )
									ret := 0.218543
								if( bearPower > 0.273119 )
									ret := -0.341772
						if( d_k > 16.1665 )
							if( smoothK_k <= 58.065 )
								ret := -0.727273 // sell
							if( smoothK_k > 58.065 )
								ret := 0.142857
				if( d > 79.9015 )
					if( bbm <= 0.059778 )
						if( bbp <= 0.360225 )
							if( bearPower <= 0.030656 )
								if( d <= 81.8451 )
									ret := 0.183908
								if( d > 81.8451 )
									ret := -0.198039
							if( bearPower > 0.030656 )
								if( smoothD_d <= 81.7887 )
									ret := 0.130137
								if( smoothD_d > 81.7887 )
									ret := -0.093643
						if( bbp > 0.360225 )
							if( bullPower <= 1.1844 )
								if( rsi1 <= 84.832 )
									ret := -0.317495
								if( rsi1 > 84.832 )
									ret := 0.097744
							if( bullPower > 1.1844 )
								if( d_k <= -0.336886 )
									ret := 0.250000
								if( d_k > -0.336886 )
									ret := 1.000000 // buy
					if( bbm > 0.059778 )
						if( bearPower <= 0.233591 )
							if( smoothD_d <= 96.8948 )
								if( bbp <= 0.407116 )
									ret := -0.005109
								if( bbp > 0.407116 )
									ret := 0.105536
							if( smoothD_d > 96.8948 )
								if( bearPower <= 0.132091 )
									ret := 0.484305
								if( bearPower > 0.132091 )
									ret := -0.257732
						if( bearPower > 0.233591 )
							if( d <= 83.1656 )
								if( bbm <= 0.604394 )
									ret := -0.394118
								if( bbm > 0.604394 )
									ret := -0.950000 // sell
							if( d > 83.1656 )
								if( rsi1 <= 69.0752 )
									ret := -0.281437
								if( rsi1 > 69.0752 )
									ret := -0.015847
			if( rsi1 > 92.4305 )
				if( smoothK_k <= 95.8785 )
					if( bullPower <= 0.417801 )
						if( d_k <= -0.659613 )
							if( d_k <= -5.10143 )
								ret := 0.750000 // buy
							if( d_k > -5.10143 )
								ret := 1.000000 // buy
						if( d_k > -0.659613 )
							if( rsi1 <= 97.0826 )
								ret := 0.100000
							if( rsi1 > 97.0826 )
								ret := 1.000000 // buy
					if( bullPower > 0.417801 )
						ret := 1.000000 // buy
				if( smoothK_k > 95.8785 )
					if( smoothK_k <= 96.4089 )
						if( d_k <= 0.344445 )
							ret := -0.500000
						if( d_k > 0.344445 )
							ret := -0.833333 // sell
					if( smoothK_k > 96.4089 )
						if( bearPower <= 0.656576 )
							if( bbm <= 0.178485 )
								if( k <= 99.9728 )
									ret := -0.296296
								if( k > 99.9728 )
									ret := 0.083333
							if( bbm > 0.178485 )
								if( k <= 99.9987 )
									ret := 0.903226 // buy
								if( k > 99.9987 )
									ret := 0.684211
						if( bearPower > 0.656576 )
							ret := -0.266667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_SNOW_1Min_bef6b78f(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


