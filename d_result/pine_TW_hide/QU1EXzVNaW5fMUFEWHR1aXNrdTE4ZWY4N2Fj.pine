//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: AMD_5Min_1ADX_18ef87ac Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1ADX_18ef87ac", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_18ef87ac(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 0.360827 )
		if( smoothedTrueRange <= 0.463746 )
			if( directionalMovementMinus <= 3e-06 )
				if( smoothedDirectionalMovementPlus <= 0.037496 )
					if( trueRange <= 1.01 )
						if( smoothedTrueRange <= 0.430104 )
							if( adx <= 17.6181 )
								if( diPlus <= 28.1316 )
									ret := 0.095178
								if( diPlus > 28.1316 )
									ret := 0.009524
							if( adx > 17.6181 )
								if( diMinus <= 77.7354 )
									ret := -0.001394
								if( diMinus > 77.7354 )
									ret := -0.600000
						if( smoothedTrueRange > 0.430104 )
							if( adx <= 37.2406 )
								if( trueRange <= 0.405942 )
									ret := 0.550000
								if( trueRange > 0.405942 )
									ret := 1.000000 // buy
							if( adx > 37.2406 )
								if( directionalMovementPlus <= 0.169339 )
									ret := -0.025000
								if( directionalMovementPlus > 0.169339 )
									ret := 0.812500 // buy
					if( trueRange > 1.01 )
						if( diMinus <= 38.6159 )
							ret := -0.750000 // sell
						if( diMinus > 38.6159 )
							ret := -1.000000 // sell
				if( smoothedDirectionalMovementPlus > 0.037496 )
					if( directionalMovementPlus <= 0.219137 )
						if( smoothedTrueRange <= 0.428036 )
							if( adx <= 72.1079 )
								if( dx <= 92.2667 )
									ret := 0.078600
								if( dx > 92.2667 )
									ret := 0.310881
							if( adx > 72.1079 )
								if( diPlus <= 57.9311 )
									ret := -0.115108
								if( diPlus > 57.9311 )
									ret := 0.200000
						if( smoothedTrueRange > 0.428036 )
							if( adx <= 71.5113 )
								if( diPlus <= 26.7637 )
									ret := -0.095675
								if( diPlus > 26.7637 )
									ret := 0.078947
							if( adx > 71.5113 )
								if( diPlus <= 45.2043 )
									ret := 0.730769 // buy
								if( diPlus > 45.2043 )
									ret := -0.428571
					if( directionalMovementPlus > 0.219137 )
						if( dx <= 14.2173 )
							if( trueRange <= 1.66 )
								if( diMinus <= 25.9158 )
									ret := 0.034884
								if( diMinus > 25.9158 )
									ret := -0.313869
							if( trueRange > 1.66 )
								ret := -1.000000 // sell
						if( dx > 14.2173 )
							if( adx <= 32.5193 )
								if( diMinus <= 10.2354 )
									ret := 0.280488
								if( diMinus > 10.2354 )
									ret := 0.061024
							if( adx > 32.5193 )
								if( dx <= 95.6284 )
									ret := -0.032328
								if( dx > 95.6284 )
									ret := 0.384615
			if( directionalMovementMinus > 3e-06 )
				if( smoothedDirectionalMovementPlus <= 0.042356 )
					if( smoothedDirectionalMovementMinus <= 0.107106 )
						if( diMinus <= 61.0161 )
							if( adx <= 50.5862 )
								if( smoothedTrueRange <= 0.398182 )
									ret := 0.061230
								if( smoothedTrueRange > 0.398182 )
									ret := -0.321839
							if( adx > 50.5862 )
								if( diPlus <= 10.2758 )
									ret := -0.189931
								if( diPlus > 10.2758 )
									ret := 0.019802
						if( diMinus > 61.0161 )
							if( diPlus <= 3.10955 )
								if( smoothedDirectionalMovementPlus <= 0.00282 )
									ret := 0.857143 // buy
								if( smoothedDirectionalMovementPlus > 0.00282 )
									ret := 0.500000
							if( diPlus > 3.10955 )
								if( directionalMovementPlus <= 0.005569 )
									ret := -0.179592
								if( directionalMovementPlus > 0.005569 )
									ret := -0.809524 // sell
					if( smoothedDirectionalMovementMinus > 0.107106 )
						if( adx <= 35.2286 )
							if( diPlus <= 4.5388 )
								if( smoothedTrueRange <= 0.252006 )
									ret := -0.833333 // sell
								if( smoothedTrueRange > 0.252006 )
									ret := 0.767857 // buy
							if( diPlus > 4.5388 )
								if( adx <= 32.5347 )
									ret := 0.122078
								if( adx > 32.5347 )
									ret := 0.419118
						if( adx > 35.2286 )
							if( diMinus <= 53.7756 )
								if( smoothedDirectionalMovementMinus <= 0.168975 )
									ret := 0.082364
								if( smoothedDirectionalMovementMinus > 0.168975 )
									ret := -0.218447
							if( diMinus > 53.7756 )
								if( adx <= 46.407 )
									ret := -0.084906
								if( adx > 46.407 )
									ret := 0.362319
				if( smoothedDirectionalMovementPlus > 0.042356 )
					if( adx <= 80.8925 )
						if( directionalMovementPlus <= 0.000265 )
							if( smoothedDirectionalMovementPlus <= 0.090461 )
								if( dx <= 17.2011 )
									ret := 0.116661
								if( dx > 17.2011 )
									ret := 0.048185
							if( smoothedDirectionalMovementPlus > 0.090461 )
								if( diPlus <= 23.5459 )
									ret := -0.073298
								if( diPlus > 23.5459 )
									ret := 0.173263
						if( directionalMovementPlus > 0.000265 )
							if( adx <= 47.2718 )
								if( adx <= 31.1339 )
									ret := 0.203024
								if( adx > 31.1339 )
									ret := 0.050000
							if( adx > 47.2718 )
								if( smoothedDirectionalMovementPlus <= 0.065177 )
									ret := 0.474178
								if( smoothedDirectionalMovementPlus > 0.065177 )
									ret := 0.218605
					if( adx > 80.8925 )
						if( directionalMovementPlus <= 0.001787 )
							if( smoothedDirectionalMovementPlus <= 0.171354 )
								if( diMinus <= 1.85314 )
									ret := -1.000000 // sell
								if( diMinus > 1.85314 )
									ret := 0.037037
							if( smoothedDirectionalMovementPlus > 0.171354 )
								if( trueRange <= 0.205 )
									ret := -0.714286 // sell
								if( trueRange > 0.205 )
									ret := -1.000000 // sell
						if( directionalMovementPlus > 0.001787 )
							if( smoothedDirectionalMovementMinus <= 0.01299 )
								ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 0.01299 )
								if( directionalMovementMinus <= 0.026293 )
									ret := -0.200000
								if( directionalMovementMinus > 0.026293 )
									ret := -1.000000 // sell
		if( smoothedTrueRange > 0.463746 )
			if( diPlus <= 4.61698 )
				if( adx <= 56.1201 )
					if( dx <= 85.7158 )
						if( dx <= 76.5209 )
							if( adx <= 37.312 )
								if( diMinus <= 27.9094 )
									ret := 0.400000
								if( diMinus > 27.9094 )
									ret := 0.875000 // buy
							if( adx > 37.312 )
								if( adx <= 45.849 )
									ret := -0.777778 // sell
								if( adx > 45.849 )
									ret := 0.125000
						if( dx > 76.5209 )
							if( diMinus <= 33.5292 )
								if( directionalMovementMinus <= 0.075666 )
									ret := 0.129032
								if( directionalMovementMinus > 0.075666 )
									ret := 0.807692 // buy
							if( diMinus > 33.5292 )
								if( smoothedDirectionalMovementMinus <= 0.337318 )
									ret := 0.169231
								if( smoothedDirectionalMovementMinus > 0.337318 )
									ret := -1.000000 // sell
					if( dx > 85.7158 )
						if( adx <= 30.1744 )
							ret := 1.000000 // buy
						if( adx > 30.1744 )
							if( smoothedTrueRange <= 0.687415 )
								if( dx <= 86.3016 )
									ret := -0.900000 // sell
								if( dx > 86.3016 )
									ret := -0.021277
							if( smoothedTrueRange > 0.687415 )
								if( diMinus <= 34.0242 )
									ret := -0.200000
								if( diMinus > 34.0242 )
									ret := -0.785714 // sell
				if( adx > 56.1201 )
					if( smoothedTrueRange <= 0.979501 )
						if( trueRange <= 0.405823 )
							if( dx <= 84.556 )
								if( trueRange <= 0.256935 )
									ret := -0.400000
								if( trueRange > 0.256935 )
									ret := 0.447368
							if( dx > 84.556 )
								if( diMinus <= 46.942 )
									ret := -0.483871
								if( diMinus > 46.942 )
									ret := 0.230769
						if( trueRange > 0.405823 )
							if( smoothedDirectionalMovementMinus <= 0.248992 )
								if( directionalMovementMinus <= 0.333656 )
									ret := 0.733871 // buy
								if( directionalMovementMinus > 0.333656 )
									ret := 0.052632
							if( smoothedDirectionalMovementMinus > 0.248992 )
								if( trueRange <= 1.31682 )
									ret := 0.188482
								if( trueRange > 1.31682 )
									ret := 0.923077 // buy
					if( smoothedTrueRange > 0.979501 )
						ret := -1.000000 // sell
			if( diPlus > 4.61698 )
				if( dx <= 30.2562 )
					if( diPlus <= 31.4842 )
						if( smoothedDirectionalMovementMinus <= 0.322479 )
							if( diPlus <= 12.1719 )
								if( adx <= 46.6334 )
									ret := 0.430052
								if( adx > 46.6334 )
									ret := -0.106667
							if( diPlus > 12.1719 )
								if( adx <= 10.5323 )
									ret := 0.338164
								if( adx > 10.5323 )
									ret := 0.031235
						if( smoothedDirectionalMovementMinus > 0.322479 )
							if( diMinus <= 30.2927 )
								if( smoothedTrueRange <= 1.54613 )
									ret := 0.609524
								if( smoothedTrueRange > 1.54613 )
									ret := -0.076923
							if( diMinus > 30.2927 )
								if( diPlus <= 28.5393 )
									ret := 0.312500
								if( diPlus > 28.5393 )
									ret := -1.000000 // sell
					if( diPlus > 31.4842 )
						if( adx <= 44.7976 )
							if( adx <= 23.2555 )
								if( adx <= 21.3637 )
									ret := 0.351351
								if( adx > 21.3637 )
									ret := -0.538462
							if( adx > 23.2555 )
								if( trueRange <= 1.3496 )
									ret := 0.636872
								if( trueRange > 1.3496 )
									ret := 0.037037
						if( adx > 44.7976 )
							if( smoothedDirectionalMovementMinus <= 0.230139 )
								if( trueRange <= 1.39765 )
									ret := 0.085714
								if( trueRange > 1.39765 )
									ret := -0.687500
							if( smoothedDirectionalMovementMinus > 0.230139 )
								if( dx <= 5.59419 )
									ret := -0.750000 // sell
								if( dx > 5.59419 )
									ret := -1.000000 // sell
				if( dx > 30.2562 )
					if( trueRange <= 0.915027 )
						if( dx <= 36.2081 )
							if( directionalMovementMinus <= 0.146914 )
								if( adx <= 31.3385 )
									ret := 0.002016
								if( adx > 31.3385 )
									ret := -0.243873
							if( directionalMovementMinus > 0.146914 )
								if( adx <= 54.077 )
									ret := 0.125945
								if( adx > 54.077 )
									ret := -0.383333
						if( dx > 36.2081 )
							if( adx <= 18.6746 )
								if( trueRange <= 0.368976 )
									ret := 0.052632
								if( trueRange > 0.368976 )
									ret := -0.479263
							if( adx > 18.6746 )
								if( dx <= 50.7683 )
									ret := 0.099398
								if( dx > 50.7683 )
									ret := 0.011655
					if( trueRange > 0.915027 )
						if( diMinus <= 30.6342 )
							if( dx <= 89.053 )
								if( diMinus <= 24.8084 )
									ret := -0.068270
								if( diMinus > 24.8084 )
									ret := 0.230769
							if( dx > 89.053 )
								if( smoothedTrueRange <= 0.573162 )
									ret := 0.600000
								if( smoothedTrueRange > 0.573162 )
									ret := -0.877551 // sell
						if( diMinus > 30.6342 )
							if( diMinus <= 55.2023 )
								if( smoothedDirectionalMovementPlus <= 0.030656 )
									ret := -0.875000 // sell
								if( smoothedDirectionalMovementPlus > 0.030656 )
									ret := -0.236000
							if( diMinus > 55.2023 )
								if( smoothedTrueRange <= 0.571723 )
									ret := 0.714286 // buy
								if( smoothedTrueRange > 0.571723 )
									ret := -0.250000
	if( smoothedDirectionalMovementMinus > 0.360827 )
		if( diPlus <= 21.5578 )
			if( diPlus <= 2.26758 )
				if( smoothedTrueRange <= 1.19473 )
					if( diMinus <= 42.2631 )
						if( smoothedDirectionalMovementPlus <= 0.006564 )
							ret := 1.000000 // buy
						if( smoothedDirectionalMovementPlus > 0.006564 )
							if( dx <= 90.9876 )
								if( directionalMovementMinus <= 0.030927 )
									ret := -0.750000 // sell
								if( directionalMovementMinus > 0.030927 )
									ret := -0.250000
							if( dx > 90.9876 )
								if( adx <= 73.0806 )
									ret := -1.000000 // sell
								if( adx > 73.0806 )
									ret := -0.750000 // sell
					if( diMinus > 42.2631 )
						if( diMinus <= 53.4188 )
							if( directionalMovementMinus <= 0.06158 )
								if( adx <= 78.4883 )
									ret := 0.666667
								if( adx > 78.4883 )
									ret := -0.400000
							if( directionalMovementMinus > 0.06158 )
								if( smoothedDirectionalMovementMinus <= 0.375434 )
									ret := 0.250000
								if( smoothedDirectionalMovementMinus > 0.375434 )
									ret := 0.958333 // buy
						if( diMinus > 53.4188 )
							if( smoothedDirectionalMovementPlus <= 0.018882 )
								if( smoothedDirectionalMovementPlus <= 0.006033 )
									ret := -0.222222
								if( smoothedDirectionalMovementPlus > 0.006033 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementPlus > 0.018882 )
								ret := 1.000000 // buy
				if( smoothedTrueRange > 1.19473 )
					if( adx <= 52.0329 )
						ret := 0.500000
					if( adx > 52.0329 )
						ret := 1.000000 // buy
			if( diPlus > 2.26758 )
				if( diMinus <= 51.6614 )
					if( diMinus <= 45.1553 )
						if( adx <= 75.0769 )
							if( diMinus <= 40.7894 )
								if( diMinus <= 37.3729 )
									ret := -0.258004
								if( diMinus > 37.3729 )
									ret := 0.141361
							if( diMinus > 40.7894 )
								if( dx <= 63.7439 )
									ret := -0.134328
								if( dx > 63.7439 )
									ret := -0.689394
						if( adx > 75.0769 )
							if( smoothedDirectionalMovementPlus <= 0.045484 )
								if( directionalMovementMinus <= 0.01645 )
									ret := 0.142857
								if( directionalMovementMinus > 0.01645 )
									ret := -0.846154 // sell
							if( smoothedDirectionalMovementPlus > 0.045484 )
								if( diMinus <= 34.807 )
									ret := -0.333333
								if( diMinus > 34.807 )
									ret := 0.723404 // buy
					if( diMinus > 45.1553 )
						if( trueRange <= 1.2339 )
							if( dx <= 69.0937 )
								if( diMinus <= 49.4062 )
									ret := 0.878049 // buy
								if( diMinus > 49.4062 )
									ret := -0.250000
							if( dx > 69.0937 )
								if( trueRange <= 0.8187 )
									ret := -0.122807
								if( trueRange > 0.8187 )
									ret := 0.527273
						if( trueRange > 1.2339 )
							if( directionalMovementMinus <= 1.8649 )
								if( dx <= 77.7291 )
									ret := 0.000000
								if( dx > 77.7291 )
									ret := -0.692308
							if( directionalMovementMinus > 1.8649 )
								if( smoothedDirectionalMovementMinus <= 0.485355 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementMinus > 0.485355 )
									ret := 0.750000 // buy
				if( diMinus > 51.6614 )
					if( diMinus <= 66.098 )
						if( trueRange <= 4.87157 )
							if( smoothedDirectionalMovementMinus <= 0.41785 )
								if( smoothedDirectionalMovementMinus <= 0.415048 )
									ret := -0.508475
								if( smoothedDirectionalMovementMinus > 0.415048 )
									ret := 0.750000 // buy
							if( smoothedDirectionalMovementMinus > 0.41785 )
								if( diPlus <= 2.50961 )
									ret := 0.000000
								if( diPlus > 2.50961 )
									ret := -0.895349 // sell
						if( trueRange > 4.87157 )
							ret := 0.833333 // buy
					if( diMinus > 66.098 )
						if( directionalMovementMinus <= 0.001005 )
							if( directionalMovementPlus <= 0.03 )
								ret := 0.000000
							if( directionalMovementPlus > 0.03 )
								ret := 0.000000
						if( directionalMovementMinus > 0.001005 )
							if( adx <= 62.9734 )
								ret := 0.500000
							if( adx > 62.9734 )
								ret := 0.857143 // buy
		if( diPlus > 21.5578 )
			if( dx <= 23.9525 )
				if( dx <= 6.93347 )
					if( adx <= 43.6018 )
						if( trueRange <= 1.415 )
							ret := 1.000000 // buy
						if( trueRange > 1.415 )
							ret := 0.714286 // buy
					if( adx > 43.6018 )
						ret := -0.500000
				if( dx > 6.93347 )
					if( trueRange <= 1.06468 )
						if( adx <= 34.5853 )
							if( diMinus <= 31.8569 )
								ret := -1.000000 // sell
							if( diMinus > 31.8569 )
								if( adx <= 30.2277 )
									ret := -0.250000
								if( adx > 30.2277 )
									ret := -1.000000 // sell
						if( adx > 34.5853 )
							if( smoothedDirectionalMovementMinus <= 0.374304 )
								ret := -0.500000
							if( smoothedDirectionalMovementMinus > 0.374304 )
								ret := 0.800000 // buy
					if( trueRange > 1.06468 )
						if( diPlus <= 43.4562 )
							if( directionalMovementMinus <= 1.92978 )
								if( diMinus <= 31.0173 )
									ret := 0.958333 // buy
								if( diMinus > 31.0173 )
									ret := -0.076923
							if( directionalMovementMinus > 1.92978 )
								ret := -0.750000 // sell
						if( diPlus > 43.4562 )
							ret := -1.000000 // sell
			if( dx > 23.9525 )
				if( diPlus <= 25.714 )
					if( smoothedTrueRange <= 1.4206 )
						ret := 1.000000 // buy
					if( smoothedTrueRange > 1.4206 )
						ret := 0.500000
				if( diPlus > 25.714 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_AMD_5Min_18ef87ac(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


