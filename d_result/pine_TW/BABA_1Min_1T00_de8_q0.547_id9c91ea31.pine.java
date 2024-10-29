//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: BABA_1Min_1T00_9c91ea31 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_1Min_1T00_9c91ea31", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_1Min_9c91ea31(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.041168 )
		if( ema1 <= 107.801 )
			if( ema2 <= 94.7312 )
				if( ema1 <= 80.6536 )
					if( tema <= 79.6119 )
						if( ema1 <= 78.0849 )
							if( ema3 <= 77.7749 )
								if( ema1 <= 77.601 )
									ret := 0.152068
								if( ema1 > 77.601 )
									ret := -0.694444
							if( ema3 > 77.7749 )
								if( ema2 <= 78.3501 )
									ret := 0.397119
								if( ema2 > 78.3501 )
									ret := -0.916667 // sell
						if( ema1 > 78.0849 )
							if( ema13 <= -0.81635 )
								if( ema3 <= 79.8674 )
									ret := -1.000000 // sell
								if( ema3 > 79.8674 )
									ret := -0.500000
							if( ema13 > -0.81635 )
								if( ema13 <= -0.106772 )
									ret := -0.014965
								if( ema13 > -0.106772 )
									ret := 0.161098
					if( tema > 79.6119 )
						if( ema2 <= 80.3023 )
							if( ema1 <= 80.0047 )
								if( ema13 <= -0.244725 )
									ret := -0.113636
								if( ema13 > -0.244725 )
									ret := 0.473430
							if( ema1 > 80.0047 )
								if( ema12 <= -0.085478 )
									ret := 0.934211 // buy
								if( ema12 > -0.085478 )
									ret := 0.668478
						if( ema2 > 80.3023 )
							if( ema3 <= 80.6978 )
								if( ema13 <= -0.311321 )
									ret := -0.690476
								if( ema13 > -0.311321 )
									ret := -0.007444
							if( ema3 > 80.6978 )
								if( ema12 <= -0.421169 )
									ret := -0.185185
								if( ema12 > -0.421169 )
									ret := 0.613527
				if( ema1 > 80.6536 )
					if( ema12 <= -0.076578 )
						if( ema13 <= -0.366225 )
							if( ema13 <= -1.31928 )
								if( ema12 <= -0.814511 )
									ret := 1.000000 // buy
								if( ema12 > -0.814511 )
									ret := 0.750000 // buy
							if( ema13 > -1.31928 )
								if( ema1 <= 81.581 )
									ret := -0.821429 // sell
								if( ema1 > 81.581 )
									ret := -0.097938
						if( ema13 > -0.366225 )
							if( ema2 <= 88.5307 )
								if( tema <= 87.386 )
									ret := 0.160996
								if( tema > 87.386 )
									ret := -0.337838
							if( ema2 > 88.5307 )
								if( tema <= 88.4877 )
									ret := 0.923077 // buy
								if( tema > 88.4877 )
									ret := 0.257426
					if( ema12 > -0.076578 )
						if( ema13 <= -0.099697 )
							if( ema3 <= 82.9569 )
								if( ema1 <= 82.2004 )
									ret := -0.286334
								if( ema1 > 82.2004 )
									ret := -0.594937
							if( ema3 > 82.9569 )
								if( tema <= 85.1066 )
									ret := 0.109415
								if( tema > 85.1066 )
									ret := -0.210169
						if( ema13 > -0.099697 )
							if( ema1 <= 87.1762 )
								if( ema3 <= 80.858 )
									ret := -0.666667
								if( ema3 > 80.858 )
									ret := 0.152042
							if( ema1 > 87.1762 )
								if( ema3 <= 87.7268 )
									ret := -0.694444
								if( ema3 > 87.7268 )
									ret := -0.152778
			if( ema2 > 94.7312 )
				if( ema1 <= 102.686 )
					if( ema13 <= -0.115486 )
						if( ema1 <= 102.542 )
							if( ema2 <= 96.0528 )
								if( tema <= 94.6688 )
									ret := 0.950000 // buy
								if( tema > 94.6688 )
									ret := 0.688312
							if( ema2 > 96.0528 )
								if( ema3 <= 96.378 )
									ret := -1.000000 // sell
								if( ema3 > 96.378 )
									ret := 0.685185
						if( ema1 > 102.542 )
							ret := 1.000000 // buy
					if( ema13 > -0.115486 )
						if( tema <= 100.987 )
							if( ema3 <= 95.8234 )
								if( ema12 <= -0.053056 )
									ret := 0.888889 // buy
								if( ema12 > -0.053056 )
									ret := 0.030303
							if( ema3 > 95.8234 )
								if( ema12 <= -0.051513 )
									ret := -0.406250
								if( ema12 > -0.051513 )
									ret := 0.080000
						if( tema > 100.987 )
							if( ema2 <= 101.186 )
								if( ema3 <= 101.179 )
									ret := 1.000000 // buy
								if( ema3 > 101.179 )
									ret := 0.000000
							if( ema2 > 101.186 )
								ret := 1.000000 // buy
				if( ema1 > 102.686 )
					if( ema1 <= 102.998 )
						if( tema <= 102.532 )
							ret := 0.000000
						if( tema > 102.532 )
							if( ema13 <= 0.002468 )
								if( ema1 <= 102.725 )
									ret := -0.500000
								if( ema1 > 102.725 )
									ret := -0.975610 // sell
							if( ema13 > 0.002468 )
								ret := -0.250000
					if( ema1 > 102.998 )
						if( ema3 <= 107.683 )
							if( tema <= 106.917 )
								if( ema2 <= 107.199 )
									ret := 0.289017
								if( ema2 > 107.199 )
									ret := 0.964286 // buy
							if( tema > 106.917 )
								if( tema <= 106.966 )
									ret := -0.705882 // sell
								if( tema > 106.966 )
									ret := 0.040698
						if( ema3 > 107.683 )
							if( ema3 <= 107.752 )
								if( tema <= 107.57 )
									ret := 0.871795 // buy
								if( tema > 107.57 )
									ret := 0.583333
							if( ema3 > 107.752 )
								if( ema13 <= -0.085279 )
									ret := 0.481481
								if( ema13 > -0.085279 )
									ret := -0.769231 // sell
		if( ema1 > 107.801 )
			if( tema <= 114.287 )
				if( ema12 <= -0.045753 )
					if( ema2 <= 114.522 )
						if( ema12 <= -0.283277 )
							if( tema <= 110.182 )
								if( ema1 <= 107.973 )
									ret := -0.666667
								if( ema1 > 107.973 )
									ret := 0.533333
							if( tema > 110.182 )
								if( tema <= 112.793 )
									ret := -0.433333
								if( tema > 112.793 )
									ret := 0.363636
						if( ema12 > -0.283277 )
							if( ema1 <= 107.89 )
								if( ema3 <= 107.989 )
									ret := -0.133333
								if( ema3 > 107.989 )
									ret := -0.925926 // sell
							if( ema1 > 107.89 )
								if( tema <= 107.8 )
									ret := 0.468085
								if( tema > 107.8 )
									ret := -0.033881
					if( ema2 > 114.522 )
						if( tema <= 113.818 )
							if( ema13 <= -0.905314 )
								ret := -0.857143 // sell
							if( ema13 > -0.905314 )
								ret := 0.400000
						if( tema > 113.818 )
							if( ema3 <= 115.178 )
								ret := -1.000000 // sell
							if( ema3 > 115.178 )
								ret := -0.750000 // sell
				if( ema12 > -0.045753 )
					if( tema <= 108.947 )
						if( ema1 <= 108.303 )
							if( ema3 <= 108.037 )
								ret := 0.250000
							if( ema3 > 108.037 )
								if( ema3 <= 108.212 )
									ret := -1.000000 // sell
								if( ema3 > 108.212 )
									ret := -0.250000
						if( ema1 > 108.303 )
							if( ema1 <= 108.746 )
								if( ema13 <= -0.057117 )
									ret := 1.000000 // buy
								if( ema13 > -0.057117 )
									ret := 0.666667
							if( ema1 > 108.746 )
								ret := 0.142857
					if( tema > 108.947 )
						if( ema2 <= 109.273 )
							ret := -1.000000 // sell
						if( ema2 > 109.273 )
							if( ema2 <= 109.341 )
								ret := 0.500000
							if( ema2 > 109.341 )
								if( ema13 <= -0.089335 )
									ret := -0.659574
								if( ema13 > -0.089335 )
									ret := -0.321429
			if( tema > 114.287 )
				if( ema1 <= 114.597 )
					if( tema <= 114.345 )
						if( ema3 <= 114.469 )
							ret := 0.500000
						if( ema3 > 114.469 )
							ret := 1.000000 // buy
					if( tema > 114.345 )
						if( ema3 <= 114.704 )
							if( tema <= 114.396 )
								if( ema2 <= 114.539 )
									ret := -0.250000
								if( ema2 > 114.539 )
									ret := 0.000000
							if( tema > 114.396 )
								if( tema <= 114.438 )
									ret := 0.500000
								if( tema > 114.438 )
									ret := 0.250000
						if( ema3 > 114.704 )
							if( tema <= 114.464 )
								ret := 0.714286 // buy
							if( tema > 114.464 )
								ret := 1.000000 // buy
				if( ema1 > 114.597 )
					if( tema <= 117.563 )
						if( ema2 <= 117.559 )
							if( ema2 <= 115.13 )
								if( ema13 <= -0.034477 )
									ret := -0.571429
								if( ema13 > -0.034477 )
									ret := 0.875000 // buy
							if( ema2 > 115.13 )
								if( tema <= 114.868 )
									ret := 0.866667 // buy
								if( tema > 114.868 )
									ret := 0.095149
						if( ema2 > 117.559 )
							if( ema13 <= -0.080492 )
								if( ema1 <= 117.542 )
									ret := 1.000000 // buy
								if( ema1 > 117.542 )
									ret := 0.851852 // buy
							if( ema13 > -0.080492 )
								if( ema1 <= 117.616 )
									ret := 0.000000
								if( ema1 > 117.616 )
									ret := 0.500000
					if( tema > 117.563 )
						if( ema2 <= 118.104 )
							if( ema2 <= 117.812 )
								ret := -0.500000
							if( ema2 > 117.812 )
								if( tema <= 117.621 )
									ret := -0.750000 // sell
								if( tema > 117.621 )
									ret := -1.000000 // sell
						if( ema2 > 118.104 )
							if( tema <= 118.355 )
								if( ema3 <= 118.594 )
									ret := 0.600000
								if( ema3 > 118.594 )
									ret := 1.000000 // buy
							if( tema > 118.355 )
								ret := 1.000000 // buy
	if( ema12 > -0.041168 )
		if( tema <= 117.525 )
			if( ema2 <= 68.4275 )
				if( ema12 <= 0.032821 )
					if( ema12 <= -0.030311 )
						if( ema13 <= -0.071191 )
							ret := 0.750000 // buy
						if( ema13 > -0.071191 )
							ret := 0.200000
					if( ema12 > -0.030311 )
						if( ema2 <= 68.401 )
							if( tema <= 68.4264 )
								if( ema2 <= 68.2536 )
									ret := 0.666667
								if( ema2 > 68.2536 )
									ret := 0.923077 // buy
							if( tema > 68.4264 )
								ret := 0.250000
						if( ema2 > 68.401 )
							ret := 1.000000 // buy
				if( ema12 > 0.032821 )
					if( ema1 <= 68.4596 )
						if( tema <= 68.4232 )
							ret := 0.750000 // buy
						if( tema > 68.4232 )
							ret := -0.142857
					if( ema1 > 68.4596 )
						ret := 0.750000 // buy
			if( ema2 > 68.4275 )
				if( ema12 <= 0.174619 )
					if( ema12 <= 0.08989 )
						if( ema13 <= 0.191679 )
							if( ema2 <= 80.5999 )
								if( tema <= 80.5595 )
									ret := 0.044629
								if( tema > 80.5595 )
									ret := 0.417647
							if( ema2 > 80.5999 )
								if( ema1 <= 89.818 )
									ret := -0.010085
								if( ema1 > 89.818 )
									ret := 0.055408
						if( ema13 > 0.191679 )
							if( ema13 <= 0.257632 )
								if( ema13 <= 0.193847 )
									ret := 0.863636 // buy
								if( ema13 > 0.193847 )
									ret := 0.309434
							if( ema13 > 0.257632 )
								if( ema12 <= 0.085414 )
									ret := 0.853659 // buy
								if( ema12 > 0.085414 )
									ret := 0.300000
					if( ema12 > 0.08989 )
						if( ema13 <= 0.190624 )
							if( ema1 <= 75.4194 )
								if( tema <= 75.4019 )
									ret := -0.347150
								if( tema > 75.4019 )
									ret := -0.931034 // sell
							if( ema1 > 75.4194 )
								if( ema1 <= 97.0704 )
									ret := -0.000997
								if( ema1 > 97.0704 )
									ret := 0.238477
						if( ema13 > 0.190624 )
							if( tema <= 78.1775 )
								if( ema3 <= 69.4985 )
									ret := -0.642857
								if( ema3 > 69.4985 )
									ret := 0.425614
							if( tema > 78.1775 )
								if( ema3 <= 81.5489 )
									ret := -0.189509
								if( ema3 > 81.5489 )
									ret := 0.209964
				if( ema12 > 0.174619 )
					if( ema1 <= 107.494 )
						if( ema13 <= 0.417982 )
							if( tema <= 106.53 )
								if( ema3 <= 75.6765 )
									ret := -0.674603
								if( ema3 > 75.6765 )
									ret := -0.189474
							if( tema > 106.53 )
								if( ema12 <= 0.252221 )
									ret := 0.897436 // buy
								if( ema12 > 0.252221 )
									ret := -0.500000
						if( ema13 > 0.417982 )
							if( ema1 <= 80.1362 )
								if( ema3 <= 78.1833 )
									ret := 0.209677
								if( ema3 > 78.1833 )
									ret := -0.553571
							if( ema1 > 80.1362 )
								if( ema3 <= 79.8518 )
									ret := 0.866667 // buy
								if( ema3 > 79.8518 )
									ret := 0.236800
					if( ema1 > 107.494 )
						if( ema2 <= 115.733 )
							if( ema12 <= 0.190634 )
								if( ema3 <= 108.127 )
									ret := 0.500000
								if( ema3 > 108.127 )
									ret := -0.163043
							if( ema12 > 0.190634 )
								if( tema <= 114.318 )
									ret := -0.637195
								if( tema > 114.318 )
									ret := -0.183673
						if( ema2 > 115.733 )
							if( ema3 <= 115.938 )
								ret := 1.000000 // buy
							if( ema3 > 115.938 )
								if( tema <= 117.439 )
									ret := 0.545455
								if( tema > 117.439 )
									ret := 1.000000 // buy
		if( tema > 117.525 )
			if( ema3 <= 117.545 )
				if( ema12 <= 0.105044 )
					if( ema1 <= 117.513 )
						if( ema3 <= 117.317 )
							ret := 1.000000 // buy
						if( ema3 > 117.317 )
							if( ema12 <= 0.05003 )
								ret := 0.250000
							if( ema12 > 0.05003 )
								ret := -0.200000
					if( ema1 > 117.513 )
						if( ema2 <= 117.558 )
							if( ema12 <= 0.052526 )
								if( ema3 <= 117.509 )
									ret := -0.416667
								if( ema3 > 117.509 )
									ret := -1.000000 // sell
							if( ema12 > 0.052526 )
								if( ema13 <= 0.16529 )
									ret := -1.000000 // sell
								if( ema13 > 0.16529 )
									ret := -0.750000 // sell
						if( ema2 > 117.558 )
							if( tema <= 117.609 )
								ret := 0.000000
							if( tema > 117.609 )
								ret := -0.500000
				if( ema12 > 0.105044 )
					if( ema1 <= 116.573 )
						ret := -0.333333
					if( ema1 > 116.573 )
						if( ema3 <= 114.404 )
							ret := -0.500000
						if( ema3 > 114.404 )
							if( ema3 <= 117.303 )
								if( tema <= 117.547 )
									ret := -0.750000 // sell
								if( tema > 117.547 )
									ret := -0.961538 // sell
							if( ema3 > 117.303 )
								ret := -0.714286 // sell
			if( ema3 > 117.545 )
				if( ema1 <= 118.622 )
					if( tema <= 118.017 )
						if( tema <= 117.677 )
							if( ema12 <= 0.001084 )
								if( ema13 <= 0.016345 )
									ret := -0.083333
								if( ema13 > 0.016345 )
									ret := -0.666667
							if( ema12 > 0.001084 )
								if( ema1 <= 117.585 )
									ret := 0.000000
								if( ema1 > 117.585 )
									ret := 0.820513 // buy
						if( tema > 117.677 )
							if( ema2 <= 117.671 )
								if( ema2 <= 117.576 )
									ret := 0.000000
								if( ema2 > 117.576 )
									ret := -0.840000 // sell
							if( ema2 > 117.671 )
								if( ema3 <= 117.685 )
									ret := -0.555556
								if( ema3 > 117.685 )
									ret := 0.071429
					if( tema > 118.017 )
						if( tema <= 118.146 )
							if( ema2 <= 117.964 )
								if( ema13 <= 0.172693 )
									ret := 0.875000 // buy
								if( ema13 > 0.172693 )
									ret := -0.500000
							if( ema2 > 117.964 )
								ret := -1.000000 // sell
						if( tema > 118.146 )
							if( ema12 <= 0.181272 )
								ret := 1.000000 // buy
							if( ema12 > 0.181272 )
								ret := 0.500000
				if( ema1 > 118.622 )
					if( ema1 <= 118.7 )
						ret := -0.750000 // sell
					if( ema1 > 118.7 )
						if( tema <= 119.032 )
							ret := -1.000000 // sell
						if( tema > 119.032 )
							ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_BABA_1Min_9c91ea31(ema3, tema, ema2, ema12, ema13, ema1)

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


