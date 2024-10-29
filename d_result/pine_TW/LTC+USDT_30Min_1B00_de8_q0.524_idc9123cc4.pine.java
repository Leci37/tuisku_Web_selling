//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: LTCUSDT_30Min_1B00_c9123cc4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_1B00_c9123cc4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_c9123cc4(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -1.82171 )
		if( bbp <= -7.83871 )
			if( bbp <= -15.1699 )
				if( bearPower <= -11.0908 )
					if( bbm <= 4.98734 )
						if( bullPower <= -7.51666 )
							if( bullPower <= -9.97374 )
								ret := -1.000000 // sell
							if( bullPower > -9.97374 )
								ret := 0.500000
						if( bullPower > -7.51666 )
							ret := -1.000000 // sell
					if( bbm > 4.98734 )
						if( bullPower <= -2.99116 )
							if( bbm <= 9.91893 )
								if( bbp <= -19.1032 )
									ret := 0.044872
								if( bbp > -19.1032 )
									ret := 0.357798
							if( bbm > 9.91893 )
								if( bbp <= -22.424 )
									ret := 0.313869
								if( bbp > -22.424 )
									ret := 0.927273 // buy
						if( bullPower > -2.99116 )
							if( bullPower <= -2.33393 )
								if( bbp <= -16.7041 )
									ret := -0.750000 // sell
								if( bbp > -16.7041 )
									ret := 0.000000
							if( bullPower > -2.33393 )
								if( bbm <= 14.3292 )
									ret := 0.666667
								if( bbm > 14.3292 )
									ret := 0.000000
				if( bearPower > -11.0908 )
					if( bullPower <= -4.57868 )
						if( bbm <= 4.32159 )
							if( bbm <= 4.19695 )
								if( bearPower <= -9.79967 )
									ret := 0.000000
								if( bearPower > -9.79967 )
									ret := 1.000000 // buy
							if( bbm > 4.19695 )
								ret := -1.000000 // sell
						if( bbm > 4.32159 )
							if( bbm <= 6.04903 )
								if( bullPower <= -5.21738 )
									ret := 0.882353 // buy
								if( bullPower > -5.21738 )
									ret := 1.000000 // buy
							if( bbm > 6.04903 )
								ret := 0.250000
					if( bullPower > -4.57868 )
						ret := -0.750000 // sell
			if( bbp > -15.1699 )
				if( bullPower <= -3.70682 )
					if( bbp <= -14.3014 )
						if( bearPower <= -9.5191 )
							if( bbp <= -14.7489 )
								if( bearPower <= -10.9062 )
									ret := -1.000000 // sell
								if( bearPower > -10.9062 )
									ret := -0.318182
							if( bbp > -14.7489 )
								if( bearPower <= -10.228 )
									ret := 0.500000
								if( bearPower > -10.228 )
									ret := 0.250000
						if( bearPower > -9.5191 )
							ret := -1.000000 // sell
					if( bbp > -14.3014 )
						if( bbp <= -13.7092 )
							if( bbp <= -14.1748 )
								ret := 0.250000
							if( bbp > -14.1748 )
								if( bearPower <= -9.93313 )
									ret := 0.857143 // buy
								if( bearPower > -9.93313 )
									ret := 1.000000 // buy
						if( bbp > -13.7092 )
							if( bullPower <= -4.19221 )
								if( bbm <= 3.49763 )
									ret := -0.109375
								if( bbm > 3.49763 )
									ret := 0.541667
							if( bullPower > -4.19221 )
								if( bearPower <= -7.56708 )
									ret := -0.527778
								if( bearPower > -7.56708 )
									ret := -0.079208
				if( bullPower > -3.70682 )
					if( bullPower <= -0.154016 )
						if( bearPower <= -8.0142 )
							if( bbm <= 6.62954 )
								if( bbp <= -12.29 )
									ret := -0.181818
								if( bbp > -12.29 )
									ret := 0.694444
							if( bbm > 6.62954 )
								if( bbm <= 7.14566 )
									ret := -0.575758
								if( bbm > 7.14566 )
									ret := 0.165179
						if( bearPower > -8.0142 )
							if( bbp <= -9.12638 )
								if( bbm <= 4.86367 )
									ret := 0.018519
								if( bbm > 4.86367 )
									ret := -0.362069
							if( bbp > -9.12638 )
								if( bbp <= -8.20538 )
									ret := 0.237354
								if( bbp > -8.20538 )
									ret := -0.109244
					if( bullPower > -0.154016 )
						if( bbm <= 10.0049 )
							if( bearPower <= -9.12282 )
								ret := -0.750000 // sell
							if( bearPower > -9.12282 )
								if( bearPower <= -8.25322 )
									ret := -1.000000 // sell
								if( bearPower > -8.25322 )
									ret := -0.750000 // sell
						if( bbm > 10.0049 )
							if( bearPower <= -9.98241 )
								if( bearPower <= -10.5295 )
									ret := 0.137931
								if( bearPower > -10.5295 )
									ret := -0.375000
							if( bearPower > -9.98241 )
								ret := 0.800000 // buy
		if( bbp > -7.83871 )
			if( bbm <= 2.02437 )
				if( bbp <= -3.29092 )
					if( bullPower <= -2.90863 )
						if( bearPower <= -4.43219 )
							if( bullPower <= -3.04838 )
								ret := 0.857143 // buy
							if( bullPower > -3.04838 )
								ret := 1.000000 // buy
						if( bearPower > -4.43219 )
							if( bearPower <= -4.01622 )
								if( bullPower <= -3.10064 )
									ret := 0.285714
								if( bullPower > -3.10064 )
									ret := -0.500000
							if( bearPower > -4.01622 )
								ret := 0.666667
					if( bullPower > -2.90863 )
						if( bearPower <= -4.26846 )
							if( bbp <= -7.5278 )
								ret := 0.666667
							if( bbp > -7.5278 )
								if( bearPower <= -4.38281 )
									ret := -0.900000 // sell
								if( bearPower > -4.38281 )
									ret := -0.444444
						if( bearPower > -4.26846 )
							if( bbm <= 1.89701 )
								if( bullPower <= -0.924424 )
									ret := 0.055416
								if( bullPower > -0.924424 )
									ret := 0.427083
							if( bbm > 1.89701 )
								if( bbp <= -3.39356 )
									ret := -0.072727
								if( bbp > -3.39356 )
									ret := -0.888889 // sell
				if( bbp > -3.29092 )
					if( bbp <= -2.65655 )
						if( bullPower <= -0.65297 )
							if( bearPower <= -1.94534 )
								if( bullPower <= -1.0751 )
									ret := 0.451220
								if( bullPower > -1.0751 )
									ret := 0.021700
							if( bearPower > -1.94534 )
								if( bbm <= 0.743085 )
									ret := 0.172093
								if( bbm > 0.743085 )
									ret := 0.519313
						if( bullPower > -0.65297 )
							if( bullPower <= -0.609148 )
								if( bearPower <= -2.10435 )
									ret := 0.630137
								if( bearPower > -2.10435 )
									ret := 1.000000 // buy
							if( bullPower > -0.609148 )
								if( bbm <= 1.53322 )
									ret := -0.500000
								if( bbm > 1.53322 )
									ret := 0.439189
					if( bbp > -2.65655 )
						if( bbp <= -2.38478 )
							if( bearPower <= -1.61463 )
								if( bbm <= 1.205 )
									ret := 0.158416
								if( bbm > 1.205 )
									ret := -0.011905
							if( bearPower > -1.61463 )
								if( bearPower <= -1.56397 )
									ret := -0.409091
								if( bearPower > -1.56397 )
									ret := -0.033708
						if( bbp > -2.38478 )
							if( bbp <= -2.35246 )
								if( bearPower <= -2.09658 )
									ret := -0.800000 // sell
								if( bearPower > -2.09658 )
									ret := 0.556701
							if( bbp > -2.35246 )
								if( bearPower <= -1.4896 )
									ret := 0.091625
								if( bearPower > -1.4896 )
									ret := 0.244571
			if( bbm > 2.02437 )
				if( bearPower <= -2.08378 )
					if( bullPower <= -2.00092 )
						if( bearPower <= -4.63691 )
							if( bullPower <= -2.64084 )
								if( bbp <= -7.68094 )
									ret := 0.000000
								if( bbp > -7.68094 )
									ret := -0.714286 // sell
							if( bullPower > -2.64084 )
								if( bearPower <= -5.58018 )
									ret := -0.125000
								if( bearPower > -5.58018 )
									ret := 0.771812 // buy
						if( bearPower > -4.63691 )
							if( bbm <= 2.50409 )
								if( bbp <= -7.09571 )
									ret := -0.875000 // sell
								if( bbp > -7.09571 )
									ret := -0.106383
							if( bbm > 2.50409 )
								if( bbm <= 2.51959 )
									ret := 1.000000 // buy
								if( bbm > 2.51959 )
									ret := 0.250000
					if( bullPower > -2.00092 )
						if( bbp <= -3.31329 )
							if( bbp <= -6.82816 )
								if( bearPower <= -5.14409 )
									ret := 0.108280
								if( bearPower > -5.14409 )
									ret := -0.900000 // sell
							if( bbp > -6.82816 )
								if( bearPower <= -2.76742 )
									ret := 0.243638
								if( bearPower > -2.76742 )
									ret := 0.842105 // buy
						if( bbp > -3.31329 )
							if( bullPower <= -0.473676 )
								if( bearPower <= -2.68823 )
									ret := -0.200000
								if( bearPower > -2.68823 )
									ret := -0.576923
							if( bullPower > -0.473676 )
								if( bbm <= 2.10357 )
									ret := 0.666667
								if( bbm > 2.10357 )
									ret := 0.118609
				if( bearPower > -2.08378 )
					if( bbp <= -1.98135 )
						if( bearPower <= -2.02327 )
							ret := 0.166667
						if( bearPower > -2.02327 )
							ret := -1.000000 // sell
					if( bbp > -1.98135 )
						if( bbm <= 2.23427 )
							if( bbm <= 2.10062 )
								if( bullPower <= 0.124902 )
									ret := 0.500000
								if( bullPower > 0.124902 )
									ret := 1.000000 // buy
							if( bbm > 2.10062 )
								if( bbp <= -1.90413 )
									ret := 0.764706 // buy
								if( bbp > -1.90413 )
									ret := 1.000000 // buy
						if( bbm > 2.23427 )
							ret := 0.250000
	if( bbp > -1.82171 )
		if( bullPower <= 9.09487 )
			if( bearPower <= -0.755202 )
				if( bullPower <= 6.69577 )
					if( bbp <= 0.226201 )
						if( bearPower <= -0.809826 )
							if( bullPower <= 2.51093 )
								if( bearPower <= -2.56201 )
									ret := -0.183406
								if( bearPower > -2.56201 )
									ret := 0.072937
							if( bullPower > 2.51093 )
								if( bullPower <= 2.91284 )
									ret := 0.878049 // buy
								if( bullPower > 2.91284 )
									ret := 0.315789
						if( bearPower > -0.809826 )
							if( bbm <= 1.365 )
								if( bbp <= -0.307713 )
									ret := 0.176155
								if( bbp > -0.307713 )
									ret := -0.520833
							if( bbm > 1.365 )
								if( bbm <= 1.525 )
									ret := 0.745763 // buy
								if( bbm > 1.525 )
									ret := 0.128205
					if( bbp > 0.226201 )
						if( bullPower <= 1.21783 )
							if( bearPower <= -0.820798 )
								if( bbp <= 0.251421 )
									ret := 0.000000
								if( bbp > 0.251421 )
									ret := -0.904762 // sell
							if( bearPower > -0.820798 )
								if( bullPower <= 1.07879 )
									ret := -0.866667 // sell
								if( bullPower > 1.07879 )
									ret := 0.533333
						if( bullPower > 1.21783 )
							if( bearPower <= -3.92459 )
								if( bullPower <= 5.26266 )
									ret := -0.333333
								if( bullPower > 5.26266 )
									ret := -1.000000 // sell
							if( bearPower > -3.92459 )
								if( bbp <= 1.34105 )
									ret := -0.037123
								if( bbp > 1.34105 )
									ret := 0.121951
				if( bullPower > 6.69577 )
					if( bbp <= 6.44996 )
						if( bearPower <= -2.27926 )
							if( bbp <= 4.67187 )
								if( bbm <= 12.0799 )
									ret := 1.000000 // buy
								if( bbm > 12.0799 )
									ret := 0.750000 // buy
							if( bbp > 4.67187 )
								ret := -0.750000 // sell
						if( bearPower > -2.27926 )
							if( bullPower <= 7.02851 )
								if( bbm <= 7.775 )
									ret := 1.000000 // buy
								if( bbm > 7.775 )
									ret := 0.500000
							if( bullPower > 7.02851 )
								ret := 1.000000 // buy
					if( bbp > 6.44996 )
						if( bullPower <= 8.72946 )
							if( bbm <= 8.635 )
								ret := -0.750000 // sell
							if( bbm > 8.635 )
								ret := -0.142857
						if( bullPower > 8.72946 )
							ret := 1.000000 // buy
			if( bearPower > -0.755202 )
				if( bbm <= 3.40177 )
					if( bbp <= 9.56015 )
						if( bbp <= 6.31343 )
							if( bbp <= 4.23761 )
								if( bullPower <= 3.13402 )
									ret := 0.017731
								if( bullPower > 3.13402 )
									ret := -0.356589
							if( bbp > 4.23761 )
								if( bullPower <= 4.20889 )
									ret := 0.167201
								if( bullPower > 4.20889 )
									ret := -0.132275
						if( bbp > 6.31343 )
							if( bbp <= 6.71501 )
								if( bbp <= 6.51803 )
									ret := -0.183908
								if( bbp > 6.51803 )
									ret := -0.619048
							if( bbp > 6.71501 )
								if( bullPower <= 4.18623 )
									ret := -0.419355
								if( bullPower > 4.18623 )
									ret := -0.023006
					if( bbp > 9.56015 )
						if( bbp <= 12.0825 )
							if( bbm <= 2.21345 )
								if( bbp <= 10.5719 )
									ret := -0.315789
								if( bbp > 10.5719 )
									ret := 0.133333
							if( bbm > 2.21345 )
								if( bullPower <= 6.84593 )
									ret := 0.300000
								if( bullPower > 6.84593 )
									ret := 0.688312
						if( bbp > 12.0825 )
							if( bearPower <= 5.62664 )
								if( bbm <= 2.69792 )
									ret := -0.724138 // sell
								if( bbm > 2.69792 )
									ret := 0.241379
							if( bearPower > 5.62664 )
								if( bbm <= 1.51831 )
									ret := 0.250000
								if( bbm > 1.51831 )
									ret := 0.700000 // buy
				if( bbm > 3.40177 )
					if( bbp <= 2.72427 )
						if( bullPower <= 3.12949 )
							if( bullPower <= 2.88771 )
								if( bullPower <= 2.80274 )
									ret := 0.666667
								if( bullPower > 2.80274 )
									ret := 0.100000
							if( bullPower > 2.88771 )
								if( bearPower <= -0.42894 )
									ret := 0.875000 // buy
								if( bearPower > -0.42894 )
									ret := 0.200000
						if( bullPower > 3.12949 )
							if( bbm <= 3.93177 )
								if( bearPower <= -0.661127 )
									ret := -1.000000 // sell
								if( bearPower > -0.661127 )
									ret := 0.000000
							if( bbm > 3.93177 )
								ret := 1.000000 // buy
					if( bbp > 2.72427 )
						if( bullPower <= 7.8314 )
							if( bullPower <= 3.39254 )
								if( bullPower <= 3.20221 )
									ret := -1.000000 // sell
								if( bullPower > 3.20221 )
									ret := -0.454545
							if( bullPower > 3.39254 )
								if( bbm <= 3.49718 )
									ret := 0.546392
								if( bbm > 3.49718 )
									ret := 0.116418
						if( bullPower > 7.8314 )
							if( bearPower <= 0.485509 )
								if( bearPower <= -0.284557 )
									ret := 1.000000 // buy
								if( bearPower > -0.284557 )
									ret := 0.636364
							if( bearPower > 0.485509 )
								if( bbp <= 11.8815 )
									ret := -0.566667
								if( bbp > 11.8815 )
									ret := 0.070796
		if( bullPower > 9.09487 )
			if( bbm <= 12.2004 )
				if( bbm <= 8.29799 )
					if( bullPower <= 16.5745 )
						if( bearPower <= 4.55421 )
							if( bbp <= 13.0479 )
								if( bullPower <= 9.55171 )
									ret := -0.916667 // sell
								if( bullPower > 9.55171 )
									ret := -0.666667
							if( bbp > 13.0479 )
								if( bullPower <= 10.5525 )
									ret := -0.294118
								if( bullPower > 10.5525 )
									ret := -0.800000 // sell
						if( bearPower > 4.55421 )
							if( bearPower <= 8.27661 )
								if( bearPower <= 6.54118 )
									ret := -0.301587
								if( bearPower > 6.54118 )
									ret := 0.084746
							if( bearPower > 8.27661 )
								if( bbp <= 25.0807 )
									ret := -1.000000 // sell
								if( bbp > 25.0807 )
									ret := -0.500000
					if( bullPower > 16.5745 )
						if( bbp <= 30.1785 )
							ret := 0.600000
						if( bbp > 30.1785 )
							ret := 1.000000 // buy
				if( bbm > 8.29799 )
					if( bullPower <= 14.3015 )
						if( bbm <= 9.41379 )
							if( bearPower <= 1.82729 )
								if( bearPower <= 0.612162 )
									ret := 0.250000
								if( bearPower > 0.612162 )
									ret := 0.937500 // buy
							if( bearPower > 1.82729 )
								if( bearPower <= 3.08599 )
									ret := -0.250000
								if( bearPower > 3.08599 )
									ret := 0.636364
						if( bbm > 9.41379 )
							if( bbp <= 16.2509 )
								if( bearPower <= 1.82137 )
									ret := 0.275000
								if( bearPower > 1.82137 )
									ret := -0.933333 // sell
							if( bbp > 16.2509 )
								if( bbm <= 9.7669 )
									ret := 0.750000 // buy
								if( bbm > 9.7669 )
									ret := 0.888889 // buy
					if( bullPower > 14.3015 )
						if( bearPower <= 8.97171 )
							if( bearPower <= 5.21056 )
								ret := -0.285714
							if( bearPower > 5.21056 )
								if( bbm <= 9.18187 )
									ret := -0.750000 // sell
								if( bbm > 9.18187 )
									ret := -1.000000 // sell
						if( bearPower > 8.97171 )
							if( bbp <= 31.0135 )
								if( bbp <= 29.4229 )
									ret := 1.000000 // buy
								if( bbp > 29.4229 )
									ret := 0.750000 // buy
							if( bbp > 31.0135 )
								if( bbm <= 10.9025 )
									ret := -0.833333 // sell
								if( bbm > 10.9025 )
									ret := 0.500000
			if( bbm > 12.2004 )
				if( bbp <= 18.1656 )
					if( bearPower <= -4.82908 )
						ret := -0.800000 // sell
					if( bearPower > -4.82908 )
						ret := -1.000000 // sell
				if( bbp > 18.1656 )
					if( bbp <= 23.1625 )
						if( bbp <= 19.2682 )
							ret := -0.600000
						if( bbp > 19.2682 )
							ret := 0.000000
					if( bbp > 23.1625 )
						if( bbm <= 14.2863 )
							ret := -0.750000 // sell
						if( bbm > 14.2863 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_LTCUSDT_30Min_c9123cc4(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


