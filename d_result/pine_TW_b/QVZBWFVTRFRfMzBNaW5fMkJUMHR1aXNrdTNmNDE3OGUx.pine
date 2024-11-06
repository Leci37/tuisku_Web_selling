//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: AVAXUSDT_30Min_2BT0_3f4178e1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2BT0_3f4178e1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_3f4178e1(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -3.0033 )
		if( ema3 <= 65.0642 )
			if( bearPower <= -3.67033 )
				if( ema12 <= -1.50916 )
					if( ema13 <= -3.27273 )
						ret := 1.000000 // buy
					if( ema13 > -3.27273 )
						if( ema2 <= 32.5556 )
							ret := 0.750000 // buy
						if( ema2 > 32.5556 )
							if( bullPower <= -1.62248 )
								ret := 1.000000 // buy
							if( bullPower > -1.62248 )
								ret := 0.857143 // buy
				if( ema12 > -1.50916 )
					if( ema1 <= 36.022 )
						if( bullPower <= -0.972551 )
							if( ema13 <= -2.0746 )
								ret := 0.500000
							if( ema13 > -2.0746 )
								ret := 1.000000 // buy
						if( bullPower > -0.972551 )
							ret := -0.500000
					if( ema1 > 36.022 )
						if( bbm <= 2.34798 )
							if( ema2 <= 49.0607 )
								ret := -0.500000
							if( ema2 > 49.0607 )
								ret := 0.857143 // buy
						if( bbm > 2.34798 )
							if( ema1 <= 39.7438 )
								ret := 1.000000 // buy
							if( ema1 > 39.7438 )
								if( bbm <= 4.4696 )
									ret := 0.846154 // buy
								if( bbm > 4.4696 )
									ret := 0.000000
			if( bearPower > -3.67033 )
				if( ema2 <= 55.4113 )
					if( bullPower <= -0.701626 )
						if( bbp <= -4.49681 )
							if( ema13 <= -2.12611 )
								if( tema <= 36.8643 )
									ret := 0.625000
								if( tema > 36.8643 )
									ret := 1.000000 // buy
							if( ema13 > -2.12611 )
								if( ema3 <= 43.65 )
									ret := -0.571429
								if( ema3 > 43.65 )
									ret := 0.285714
						if( bbp > -4.49681 )
							if( ema2 <= 47.4156 )
								ret := 1.000000 // buy
							if( ema2 > 47.4156 )
								ret := 0.600000
					if( bullPower > -0.701626 )
						if( bbp <= -3.45925 )
							if( ema12 <= -1.21144 )
								ret := 0.000000
							if( ema12 > -1.21144 )
								ret := -0.857143 // sell
						if( bbp > -3.45925 )
							if( bearPower <= -3.13048 )
								ret := 1.000000 // buy
							if( bearPower > -3.13048 )
								if( bbm <= 2.66907 )
									ret := 1.000000 // buy
								if( bbm > 2.66907 )
									ret := -0.250000
				if( ema2 > 55.4113 )
					if( ema2 <= 62.4354 )
						if( ema12 <= -1.52991 )
							ret := 0.250000
						if( ema12 > -1.52991 )
							if( ema12 <= -1.01079 )
								if( ema2 <= 59.5808 )
									ret := -1.000000 // sell
								if( ema2 > 59.5808 )
									ret := -0.500000
							if( ema12 > -1.01079 )
								ret := 0.250000
					if( ema2 > 62.4354 )
						ret := 0.714286 // buy
		if( ema3 > 65.0642 )
			if( ema1 <= 63.5469 )
				if( ema1 <= 62.3764 )
					ret := -1.000000 // sell
				if( ema1 > 62.3764 )
					if( ema1 <= 63.038 )
						ret := -0.500000
					if( ema1 > 63.038 )
						ret := -1.000000 // sell
			if( ema1 > 63.5469 )
				if( bearPower <= -5.59345 )
					if( ema2 <= 102.401 )
						if( ema2 <= 80.478 )
							ret := 0.200000
						if( ema2 > 80.478 )
							if( ema13 <= -5.50814 )
								ret := 0.750000 // buy
							if( ema13 > -5.50814 )
								ret := 1.000000 // buy
					if( ema2 > 102.401 )
						if( ema12 <= -1.83758 )
							if( ema13 <= -5.33765 )
								ret := 0.750000 // buy
							if( ema13 > -5.33765 )
								if( bbp <= -9.29704 )
									ret := -0.500000
								if( bbp > -9.29704 )
									ret := -1.000000 // sell
						if( ema12 > -1.83758 )
							ret := 0.857143 // buy
				if( bearPower > -5.59345 )
					if( ema2 <= 123.839 )
						if( bbp <= -5.21734 )
							if( ema3 <= 91.2873 )
								if( tema <= 80.2696 )
									ret := 0.100000
								if( tema > 80.2696 )
									ret := -0.510638
							if( ema3 > 91.2873 )
								if( ema3 <= 103.228 )
									ret := 0.862069 // buy
								if( ema3 > 103.228 )
									ret := 0.154762
						if( bbp > -5.21734 )
							if( bbm <= 2.26738 )
								if( tema <= 107.639 )
									ret := 0.650794
								if( tema > 107.639 )
									ret := -0.064516
							if( bbm > 2.26738 )
								if( ema12 <= -0.798274 )
									ret := -0.100000
								if( ema12 > -0.798274 )
									ret := 0.491228
					if( ema2 > 123.839 )
						if( ema13 <= -1.23301 )
							if( ema13 <= -2.74372 )
								ret := 0.400000
							if( ema13 > -2.74372 )
								if( ema13 <= -2.2602 )
									ret := -0.869565 // sell
								if( ema13 > -2.2602 )
									ret := -0.222222
						if( ema13 > -1.23301 )
							if( ema3 <= 130.826 )
								ret := -0.428571
							if( ema3 > 130.826 )
								if( ema2 <= 136.373 )
									ret := 1.000000 // buy
								if( ema2 > 136.373 )
									ret := 0.400000
	if( bearPower > -3.0033 )
		if( ema2 <= 94.3543 )
			if( ema12 <= -0.470864 )
				if( tema <= 43.0315 )
					if( ema1 <= 40.103 )
						if( tema <= 37.7469 )
							if( bullPower <= -0.792032 )
								if( bullPower <= -1.30945 )
									ret := -0.263158
								if( bullPower > -1.30945 )
									ret := 0.518519
							if( bullPower > -0.792032 )
								if( ema13 <= -0.827 )
									ret := 0.254845
								if( ema13 > -0.827 )
									ret := -0.056962
						if( tema > 37.7469 )
							if( ema13 <= -1.54269 )
								if( bullPower <= -0.745706 )
									ret := 0.000000
								if( bullPower > -0.745706 )
									ret := -1.000000 // sell
							if( ema13 > -1.54269 )
								if( bullPower <= -0.066773 )
									ret := 0.137500
								if( bullPower > -0.066773 )
									ret := -1.000000 // sell
					if( ema1 > 40.103 )
						if( bbm <= 1.23848 )
							if( bullPower <= -0.493965 )
								if( bbp <= -3.17504 )
									ret := 0.333333
								if( bbp > -3.17504 )
									ret := 0.826087 // buy
							if( bullPower > -0.493965 )
								if( bullPower <= -0.104842 )
									ret := 0.219512
								if( bullPower > -0.104842 )
									ret := 1.000000 // buy
						if( bbm > 1.23848 )
							if( ema2 <= 44.556 )
								if( bullPower <= -0.605881 )
									ret := -1.000000 // sell
								if( bullPower > -0.605881 )
									ret := 0.266667
							if( ema2 > 44.556 )
								if( bearPower <= -2.54344 )
									ret := 1.000000 // buy
								if( bearPower > -2.54344 )
									ret := 0.750000 // buy
				if( tema > 43.0315 )
					if( ema2 <= 46.2977 )
						if( bullPower <= -0.916098 )
							if( bullPower <= -1.36202 )
								ret := -1.000000 // sell
							if( bullPower > -1.36202 )
								if( ema13 <= -1.42853 )
									ret := 0.200000
								if( ema13 > -1.42853 )
									ret := 0.888889 // buy
						if( bullPower > -0.916098 )
							if( ema1 <= 45.2358 )
								if( ema12 <= -0.70952 )
									ret := -0.647059
								if( ema12 > -0.70952 )
									ret := -0.931034 // sell
							if( ema1 > 45.2358 )
								if( tema <= 44.8685 )
									ret := 0.500000
								if( tema > 44.8685 )
									ret := -0.750000 // sell
					if( ema2 > 46.2977 )
						if( bbm <= 1.0974 )
							if( ema3 <= 50.948 )
								if( tema <= 47.8177 )
									ret := -0.206897
								if( tema > 47.8177 )
									ret := -0.892857 // sell
							if( ema3 > 50.948 )
								if( ema1 <= 78.9649 )
									ret := 0.143876
								if( ema1 > 78.9649 )
									ret := -0.154229
						if( bbm > 1.0974 )
							if( ema1 <= 57.6225 )
								if( ema13 <= -1.20855 )
									ret := 0.250000
								if( ema13 > -1.20855 )
									ret := 0.714286 // buy
							if( ema1 > 57.6225 )
								if( ema3 <= 84.5146 )
									ret := -0.046624
								if( ema3 > 84.5146 )
									ret := 0.321244
			if( ema12 > -0.470864 )
				if( bullPower <= -0.549128 )
					if( ema1 <= 26.5646 )
						if( ema1 <= 24.7275 )
							if( tema <= 17.1093 )
								if( ema1 <= 16.8153 )
									ret := 0.222222
								if( ema1 > 16.8153 )
									ret := 0.888889 // buy
							if( tema > 17.1093 )
								if( bbm <= 0.3478 )
									ret := -0.791667 // sell
								if( bbm > 0.3478 )
									ret := -0.031250
						if( ema1 > 24.7275 )
							if( bbm <= 0.62585 )
								ret := 0.500000
							if( bbm > 0.62585 )
								ret := 1.000000 // buy
					if( ema1 > 26.5646 )
						if( bbm <= 0.949369 )
							if( bearPower <= -1.32915 )
								if( ema13 <= -0.562148 )
									ret := -0.555556
								if( ema13 > -0.562148 )
									ret := -0.880000 // sell
							if( bearPower > -1.32915 )
								if( bbm <= 0.439115 )
									ret := -0.684211
								if( bbm > 0.439115 )
									ret := -0.156863
						if( bbm > 0.949369 )
							if( bullPower <= -0.595054 )
								if( ema2 <= 41.6095 )
									ret := -0.666667
								if( ema2 > 41.6095 )
									ret := 0.428571
							if( bullPower > -0.595054 )
								if( bearPower <= -1.63932 )
									ret := -0.800000 // sell
								if( bearPower > -1.63932 )
									ret := -0.250000
				if( bullPower > -0.549128 )
					if( bbp <= 1.81479 )
						if( bbm <= 1.05225 )
							if( ema2 <= 77.2486 )
								if( ema13 <= 0.3436 )
									ret := 0.040735
								if( ema13 > 0.3436 )
									ret := 0.108932
							if( ema2 > 77.2486 )
								if( ema3 <= 92.0776 )
									ret := -0.107202
								if( ema3 > 92.0776 )
									ret := 0.287770
						if( bbm > 1.05225 )
							if( ema1 <= 30.4445 )
								if( ema12 <= -0.17356 )
									ret := 0.633028
								if( ema12 > -0.17356 )
									ret := 0.154639
							if( ema1 > 30.4445 )
								if( ema13 <= -0.884646 )
									ret := -0.286667
								if( ema13 > -0.884646 )
									ret := 0.144465
					if( bbp > 1.81479 )
						if( tema <= 70.1194 )
							if( ema13 <= 0.22076 )
								if( bbp <= 2.38128 )
									ret := -0.413043
								if( bbp > 2.38128 )
									ret := -0.902439 // sell
							if( ema13 > 0.22076 )
								if( bullPower <= 4.23289 )
									ret := -0.079059
								if( bullPower > 4.23289 )
									ret := -0.573171
						if( tema > 70.1194 )
							if( bearPower <= 2.77564 )
								if( bbm <= 1.94838 )
									ret := 0.060185
								if( bbm > 1.94838 )
									ret := 0.400000
							if( bearPower > 2.77564 )
								if( bbp <= 8.38915 )
									ret := -0.222222
								if( bbp > 8.38915 )
									ret := -0.944444 // sell
		if( ema2 > 94.3543 )
			if( ema3 <= 121.471 )
				if( ema3 <= 117.68 )
					if( ema2 <= 95.9682 )
						if( ema13 <= -1.44732 )
							if( bullPower <= -0.280514 )
								if( bullPower <= -1.0187 )
									ret := 0.250000
								if( bullPower > -1.0187 )
									ret := 0.000000
							if( bullPower > -0.280514 )
								ret := -0.714286 // sell
						if( ema13 > -1.44732 )
							if( tema <= 96.0794 )
								if( tema <= 93.4684 )
									ret := -0.266667
								if( tema > 93.4684 )
									ret := -0.743363 // sell
							if( tema > 96.0794 )
								if( tema <= 98.3867 )
									ret := 0.040000
								if( tema > 98.3867 )
									ret := -0.875000 // sell
					if( ema2 > 95.9682 )
						if( tema <= 96.9917 )
							if( ema3 <= 96.2502 )
								if( ema2 <= 96.1129 )
									ret := -0.060606
								if( ema2 > 96.1129 )
									ret := 0.688525
							if( ema3 > 96.2502 )
								if( ema3 <= 96.9559 )
									ret := -0.604651
								if( ema3 > 96.9559 )
									ret := 0.315217
						if( tema > 96.9917 )
							if( ema2 <= 97.3279 )
								if( bbm <= 0.845 )
									ret := 0.125000
								if( bbm > 0.845 )
									ret := -0.805970 // sell
							if( ema2 > 97.3279 )
								if( ema3 <= 104.514 )
									ret := 0.131148
								if( ema3 > 104.514 )
									ret := -0.172196
				if( ema3 > 117.68 )
					if( bullPower <= 0.132123 )
						if( ema1 <= 116.906 )
							if( ema3 <= 118.908 )
								ret := -1.000000 // sell
							if( ema3 > 118.908 )
								ret := -0.714286 // sell
						if( ema1 > 116.906 )
							if( bbp <= -1.85973 )
								if( tema <= 118.843 )
									ret := -0.105263
								if( tema > 118.843 )
									ret := 0.833333 // buy
							if( bbp > -1.85973 )
								if( ema1 <= 120.156 )
									ret := -0.375000
								if( ema1 > 120.156 )
									ret := -1.000000 // sell
					if( bullPower > 0.132123 )
						if( ema13 <= 1.76247 )
							if( ema13 <= -1.17752 )
								if( ema2 <= 119.355 )
									ret := -1.000000 // sell
								if( ema2 > 119.355 )
									ret := -0.166667
							if( ema13 > -1.17752 )
								if( ema1 <= 121.436 )
									ret := 0.788732 // buy
								if( ema1 > 121.436 )
									ret := 0.355556
						if( ema13 > 1.76247 )
							if( bbm <= 2.28337 )
								if( ema2 <= 119.887 )
									ret := 0.200000
								if( ema2 > 119.887 )
									ret := -0.800000 // sell
							if( bbm > 2.28337 )
								if( bearPower <= -0.327864 )
									ret := 0.000000
								if( bearPower > -0.327864 )
									ret := 0.954545 // buy
			if( ema3 > 121.471 )
				if( bbm <= 2.18866 )
					if( ema1 <= 133.389 )
						if( ema1 <= 120.29 )
							if( bbm <= 1.58527 )
								ret := -1.000000 // sell
							if( bbm > 1.58527 )
								ret := -0.750000 // sell
						if( ema1 > 120.29 )
							if( bbp <= -1.25305 )
								if( ema3 <= 124.867 )
									ret := -0.193548
								if( ema3 > 124.867 )
									ret := -0.904762 // sell
							if( bbp > -1.25305 )
								if( ema13 <= 1.36943 )
									ret := -0.849057 // sell
								if( ema13 > 1.36943 )
									ret := -0.590909
					if( ema1 > 133.389 )
						if( ema1 <= 136.154 )
							if( ema13 <= 3.5149 )
								if( tema <= 133.657 )
									ret := 0.750000 // buy
								if( tema > 133.657 )
									ret := 0.750000 // buy
							if( ema13 > 3.5149 )
								ret := -0.500000
						if( ema1 > 136.154 )
							ret := -1.000000 // sell
				if( bbm > 2.18866 )
					if( ema3 <= 134.658 )
						if( bullPower <= 3.31236 )
							if( ema2 <= 133.97 )
								if( bbm <= 2.43684 )
									ret := -0.578947
								if( bbm > 2.43684 )
									ret := 0.000000
							if( ema2 > 133.97 )
								if( tema <= 135.422 )
									ret := 0.916667 // buy
								if( tema > 135.422 )
									ret := -0.500000
						if( bullPower > 3.31236 )
							if( ema13 <= 4.31835 )
								if( ema3 <= 123.788 )
									ret := 0.500000
								if( ema3 > 123.788 )
									ret := 0.857143 // buy
							if( ema13 > 4.31835 )
								ret := -0.400000
					if( ema3 > 134.658 )
						if( ema1 <= 133.47 )
							ret := -0.200000
						if( ema1 > 133.47 )
							if( bearPower <= -2.76844 )
								ret := -0.250000
							if( bearPower > -2.76844 )
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_AVAXUSDT_30Min_3f4178e1(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


