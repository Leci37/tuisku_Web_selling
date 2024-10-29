//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ADSK_15Min_2BV0_1d6a29b5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2BV0_1d6a29b5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_1d6a29b5(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbm <= 0.094152 )
		if( bullPower <= 0.287922 )
			if( VIP <= 0.735248 )
				if( bullPower <= -3.45735 )
					if( VIP <= 0.716655 )
						ret := 1.000000 // buy
					if( VIP > 0.716655 )
						ret := 0.750000 // buy
				if( bullPower > -3.45735 )
					if( bearPower <= -1.72665 )
						if( VIM <= 1.37716 )
							if( bullPower <= -1.9325 )
								ret := -0.250000
							if( bullPower > -1.9325 )
								ret := 0.500000
						if( VIM > 1.37716 )
							if( bbm <= 0.025119 )
								if( bearPower <= -2.42212 )
									ret := -0.312500
								if( bearPower > -2.42212 )
									ret := -0.840000 // sell
							if( bbm > 0.025119 )
								ret := 0.571429
					if( bearPower > -1.72665 )
						if( VIP <= 0.58454 )
							if( bbp <= -1.90628 )
								if( VIP <= 0.571423 )
									ret := 1.000000 // buy
								if( VIP > 0.571423 )
									ret := 0.750000 // buy
							if( bbp > -1.90628 )
								ret := 0.250000
						if( VIP > 0.58454 )
							if( VIP_VIM <= -0.899466 )
								if( bullPower <= -0.811301 )
									ret := -1.000000 // sell
								if( bullPower > -0.811301 )
									ret := -0.200000
							if( VIP_VIM > -0.899466 )
								if( VIM <= 1.30782 )
									ret := -1.000000 // sell
								if( VIM > 1.30782 )
									ret := 0.020305
			if( VIP > 0.735248 )
				if( VIP_VIM <= 0.15719 )
					if( VIP <= 1.07606 )
						if( VIP <= 0.891252 )
							if( VIM <= 1.43717 )
								if( VIM <= 1.23629 )
									ret := 0.148276
								if( VIM > 1.23629 )
									ret := 0.376524
							if( VIM > 1.43717 )
								if( bullPower <= -3.44434 )
									ret := 0.857143 // buy
								if( bullPower > -3.44434 )
									ret := -0.070796
						if( VIP > 0.891252 )
							if( VIM <= 1.58925 )
								if( bbp <= -0.263185 )
									ret := 0.033113
								if( bbp > -0.263185 )
									ret := 0.186246
							if( VIM > 1.58925 )
								if( bearPower <= -1.89019 )
									ret := 0.071429
								if( bearPower > -1.89019 )
									ret := 0.787234 // buy
					if( VIP > 1.07606 )
						if( bbm <= 0.002105 )
							if( bearPower <= -0.276577 )
								if( bullPower <= -2.28153 )
									ret := 0.232323
								if( bullPower > -2.28153 )
									ret := 0.529595
							if( bearPower > -0.276577 )
								if( VIM <= 1.02725 )
									ret := 0.103960
								if( VIM > 1.02725 )
									ret := 0.352304
						if( bbm > 0.002105 )
							if( bbp <= -5.09985 )
								if( bbm <= 0.008028 )
									ret := -0.222222
								if( bbm > 0.008028 )
									ret := 0.700000 // buy
							if( bbp > -5.09985 )
								if( bbp <= -3.23535 )
									ret := -0.689655
								if( bbp > -3.23535 )
									ret := 0.044843
				if( VIP_VIM > 0.15719 )
					if( bbp <= 0.252833 )
						if( bullPower <= -0.552701 )
							if( bearPower <= -1.45801 )
								if( VIP_VIM <= 0.537279 )
									ret := -0.078431
								if( VIP_VIM > 0.537279 )
									ret := -0.589744
							if( bearPower > -1.45801 )
								if( bbm <= 0.010109 )
									ret := 0.390947
								if( bbm > 0.010109 )
									ret := -0.531250
						if( bullPower > -0.552701 )
							if( VIM <= 0.911236 )
								if( VIP_VIM <= 0.412221 )
									ret := -0.606838
								if( VIP_VIM > 0.412221 )
									ret := 0.176471
							if( VIM > 0.911236 )
								if( bearPower <= -0.516394 )
									ret := -0.809524 // sell
								if( bearPower > -0.516394 )
									ret := 0.006316
					if( bbp > 0.252833 )
						if( bbp <= 0.563828 )
							if( VIP <= 1.15942 )
								if( VIP <= 1.1128 )
									ret := -0.571429
								if( VIP > 1.1128 )
									ret := 0.578125
							if( VIP > 1.15942 )
								if( VIP <= 1.30057 )
									ret := 0.039841
								if( VIP > 1.30057 )
									ret := 0.319588
						if( bbp > 0.563828 )
							if( VIP <= 1.28677 )
								if( bullPower <= 0.284539 )
									ret := 0.750000 // buy
								if( bullPower > 0.284539 )
									ret := 1.000000 // buy
							if( VIP > 1.28677 )
								ret := 0.500000
		if( bullPower > 0.287922 )
			if( bullPower <= 4.5845 )
				if( bbp <= 0.623499 )
					if( VIP <= 0.984303 )
						ret := 0.750000 // buy
					if( VIP > 0.984303 )
						if( bbm <= 0.021571 )
							if( bearPower <= 0.30194 )
								if( VIM <= 0.802249 )
									ret := 0.500000
								if( VIM > 0.802249 )
									ret := -0.230769
							if( bearPower > 0.30194 )
								if( VIM <= 0.781498 )
									ret := -0.875000 // sell
								if( VIM > 0.781498 )
									ret := -0.421053
						if( bbm > 0.021571 )
							if( VIP_VIM <= 0.551875 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.551875 )
								if( bullPower <= 0.310364 )
									ret := -0.750000 // sell
								if( bullPower > 0.310364 )
									ret := -0.200000
				if( bbp > 0.623499 )
					if( VIM <= 0.594056 )
						if( bbm <= 0.005 )
							if( VIP_VIM <= 1.0066 )
								ret := -1.000000 // sell
							if( VIP_VIM > 1.0066 )
								ret := -0.500000
						if( bbm > 0.005 )
							ret := -0.200000
					if( VIM > 0.594056 )
						if( VIP <= 0.967139 )
							if( bbm <= 0.008495 )
								if( bearPower <= 0.924342 )
									ret := 0.756757 // buy
								if( bearPower > 0.924342 )
									ret := -0.250000
							if( bbm > 0.008495 )
								ret := -0.285714
						if( VIP > 0.967139 )
							if( VIP_VIM <= 0.789883 )
								if( VIP <= 1.354 )
									ret := -0.033605
								if( VIP > 1.354 )
									ret := 0.102507
							if( VIP_VIM > 0.789883 )
								if( bbp <= 1.73876 )
									ret := -0.500000
								if( bbp > 1.73876 )
									ret := -0.091743
			if( bullPower > 4.5845 )
				if( VIP <= 1.27318 )
					ret := -0.166667
				if( VIP > 1.27318 )
					if( bbm <= 0.009023 )
						if( bearPower <= 5.40528 )
							ret := -1.000000 // sell
						if( bearPower > 5.40528 )
							if( bullPower <= 5.64539 )
								if( VIM <= 1.24832 )
									ret := -0.750000 // sell
								if( VIM > 1.24832 )
									ret := -0.500000
							if( bullPower > 5.64539 )
								ret := -1.000000 // sell
					if( bbm > 0.009023 )
						ret := -0.142857
	if( bbm > 0.094152 )
		if( VIP_VIM <= 0.171951 )
			if( bearPower <= 1.72455 )
				if( VIP_VIM <= -0.734935 )
					if( VIM <= 3.52192 )
						if( VIP <= 1.03852 )
							if( VIP_VIM <= -1.12566 )
								if( bbm <= 0.592682 )
									ret := 0.200000
								if( bbm > 0.592682 )
									ret := 0.764706 // buy
							if( VIP_VIM > -1.12566 )
								if( VIP <= 0.531894 )
									ret := -0.187097
								if( VIP > 0.531894 )
									ret := 0.151739
						if( VIP > 1.03852 )
							if( bbp <= -10.3256 )
								ret := 1.000000 // buy
							if( bbp > -10.3256 )
								if( bullPower <= -1.01087 )
									ret := -0.543478
								if( bullPower > -1.01087 )
									ret := 0.043478
					if( VIM > 3.52192 )
						ret := 1.000000 // buy
				if( VIP_VIM > -0.734935 )
					if( VIP <= 0.646566 )
						if( bullPower <= -1.54931 )
							if( bbm <= 1.84655 )
								if( bullPower <= -2.15984 )
									ret := -0.230769
								if( bullPower > -2.15984 )
									ret := 0.433333
							if( bbm > 1.84655 )
								if( bbp <= -9.14561 )
									ret := 0.500000
								if( bbp > -9.14561 )
									ret := -0.523810
						if( bullPower > -1.54931 )
							if( bbp <= -2.93592 )
								if( VIP <= 0.402037 )
									ret := 0.800000 // buy
								if( VIP > 0.402037 )
									ret := -0.612903
							if( bbp > -2.93592 )
								if( VIP <= 0.608911 )
									ret := -0.555556
								if( VIP > 0.608911 )
									ret := -0.101852
					if( VIP > 0.646566 )
						if( bbp <= 1.4705 )
							if( bullPower <= 0.124317 )
								if( bullPower <= -1.34326 )
									ret := -0.024551
								if( bullPower > -1.34326 )
									ret := 0.050326
							if( bullPower > 0.124317 )
								if( bearPower <= -0.871289 )
									ret := -0.082937
								if( bearPower > -0.871289 )
									ret := 0.001756
						if( bbp > 1.4705 )
							if( bbm <= 2.52538 )
								if( bullPower <= 2.52812 )
									ret := 0.118644
								if( bullPower > 2.52812 )
									ret := -0.159817
							if( bbm > 2.52538 )
								if( bbm <= 4.07586 )
									ret := 0.420690
								if( bbm > 4.07586 )
									ret := 0.016807
			if( bearPower > 1.72455 )
				if( VIP <= 1.10446 )
					if( bearPower <= 2.26816 )
						ret := 0.000000
					if( bearPower > 2.26816 )
						if( bbm <= 2.16595 )
							ret := 0.000000
						if( bbm > 2.16595 )
							ret := 0.750000 // buy
				if( VIP > 1.10446 )
					if( bearPower <= 3.64073 )
						if( bullPower <= 3.60982 )
							if( VIM <= 1.38125 )
								if( bearPower <= 2.54817 )
									ret := 0.034483
								if( bearPower > 2.54817 )
									ret := -1.000000 // sell
							if( VIM > 1.38125 )
								if( bbm <= 0.460703 )
									ret := -0.800000 // sell
								if( bbm > 0.460703 )
									ret := -0.272727
						if( bullPower > 3.60982 )
							if( bearPower <= 2.24626 )
								if( bearPower <= 2.06687 )
									ret := -0.833333 // sell
								if( bearPower > 2.06687 )
									ret := 0.428571
							if( bearPower > 2.24626 )
								if( bbm <= 2.6707 )
									ret := -0.920000 // sell
								if( bbm > 2.6707 )
									ret := -0.500000
					if( bearPower > 3.64073 )
						if( bullPower <= 4.15888 )
							ret := 1.000000 // buy
						if( bullPower > 4.15888 )
							if( bullPower <= 7.52827 )
								if( bullPower <= 7.22051 )
									ret := -0.300000
								if( bullPower > 7.22051 )
									ret := -1.000000 // sell
							if( bullPower > 7.52827 )
								if( bbp <= 15.2806 )
									ret := 0.800000 // buy
								if( bbp > 15.2806 )
									ret := -0.333333
		if( VIP_VIM > 0.171951 )
			if( VIM <= 0.944131 )
				if( bbm <= 3.2831 )
					if( bbp <= 16.2481 )
						if( VIP <= 1.44396 )
							if( bbp <= 7.10157 )
								if( VIP <= 1.05961 )
									ret := -0.245283
								if( VIP > 1.05961 )
									ret := 0.042649
							if( bbp > 7.10157 )
								if( VIP <= 1.43516 )
									ret := -0.401163
								if( VIP > 1.43516 )
									ret := 0.571429
						if( VIP > 1.44396 )
							if( bbp <= 9.46431 )
								if( bullPower <= 4.79367 )
									ret := 0.143605
								if( bullPower > 4.79367 )
									ret := -0.269841
							if( bbp > 9.46431 )
								if( VIM <= 0.769666 )
									ret := 0.181818
								if( VIM > 0.769666 )
									ret := 0.767442 // buy
					if( bbp > 16.2481 )
						if( bbp <= 17.2307 )
							ret := -1.000000 // sell
						if( bbp > 17.2307 )
							if( VIP_VIM <= 0.88073 )
								ret := -0.200000
							if( VIP_VIM > 0.88073 )
								ret := -0.750000 // sell
				if( bbm > 3.2831 )
					if( bbp <= 7.24149 )
						if( bullPower <= 4.25402 )
							if( bullPower <= 4.22931 )
								if( bbp <= 2.63806 )
									ret := 0.141414
								if( bbp > 2.63806 )
									ret := 0.469697
							if( bullPower > 4.22931 )
								ret := -1.000000 // sell
						if( bullPower > 4.25402 )
							if( bbm <= 3.712 )
								ret := 1.000000 // buy
							if( bbm > 3.712 )
								if( bbp <= 6.68879 )
									ret := 0.697917
								if( bbp > 6.68879 )
									ret := -0.600000
					if( bbp > 7.24149 )
						if( VIM <= 0.791873 )
							if( bullPower <= 14.151 )
								if( VIP_VIM <= 0.803291 )
									ret := -0.805556 // sell
								if( VIP_VIM > 0.803291 )
									ret := 0.142857
							if( bullPower > 14.151 )
								ret := 0.142857
						if( VIM > 0.791873 )
							if( bearPower <= 2.57718 )
								if( VIM <= 0.841197 )
									ret := 0.250000
								if( VIM > 0.841197 )
									ret := -1.000000 // sell
							if( bearPower > 2.57718 )
								if( bearPower <= 3.55199 )
									ret := 1.000000 // buy
								if( bearPower > 3.55199 )
									ret := 0.500000
			if( VIM > 0.944131 )
				if( bullPower <= 2.06716 )
					if( bearPower <= 0.86882 )
						if( VIP_VIM <= 0.375577 )
							if( bbm <= 0.39226 )
								if( VIP <= 1.48673 )
									ret := -0.010127
								if( VIP > 1.48673 )
									ret := 0.295455
							if( bbm > 0.39226 )
								if( VIP_VIM <= 0.249727 )
									ret := 0.144259
								if( VIP_VIM > 0.249727 )
									ret := 0.246871
						if( VIP_VIM > 0.375577 )
							if( VIM <= 1.74052 )
								if( bullPower <= 0.093313 )
									ret := 0.458333
								if( bullPower > 0.093313 )
									ret := -0.141270
							if( VIM > 1.74052 )
								if( bbm <= 0.502247 )
									ret := 0.520000
								if( bbm > 0.502247 )
									ret := 0.875000 // buy
					if( bearPower > 0.86882 )
						if( bearPower <= 1.43527 )
							if( VIP_VIM <= 0.611788 )
								if( bbm <= 0.979861 )
									ret := 0.601974
								if( bbm > 0.979861 )
									ret := -0.461538
							if( VIP_VIM > 0.611788 )
								if( bbp <= 3.23744 )
									ret := 0.390244
								if( bbp > 3.23744 )
									ret := -1.000000 // sell
						if( bearPower > 1.43527 )
							if( bbp <= 3.50179 )
								if( bbm <= 0.381977 )
									ret := -0.727273 // sell
								if( bbm > 0.381977 )
									ret := 0.250000
							if( bbp > 3.50179 )
								ret := 0.750000 // buy
				if( bullPower > 2.06716 )
					if( VIP <= 1.34621 )
						if( VIP <= 1.18224 )
							if( bearPower <= 1.18064 )
								if( bearPower <= 0.173873 )
									ret := 0.000000
								if( bearPower > 0.173873 )
									ret := 0.769231 // buy
							if( bearPower > 1.18064 )
								if( VIM <= 0.956493 )
									ret := -1.000000 // sell
								if( VIM > 0.956493 )
									ret := 0.000000
						if( VIP > 1.18224 )
							if( bbm <= 0.549149 )
								ret := 0.833333 // buy
							if( bbm > 0.549149 )
								if( bbm <= 1.79494 )
									ret := -0.487805
								if( bbm > 1.79494 )
									ret := -0.083333
					if( VIP > 1.34621 )
						if( VIP_VIM <= 0.72721 )
							if( VIM <= 1.65839 )
								if( VIP_VIM <= 0.558992 )
									ret := 0.143262
								if( VIP_VIM > 0.558992 )
									ret := -0.218543
							if( VIM > 1.65839 )
								if( bbp <= 3.17469 )
									ret := 0.000000
								if( bbp > 3.17469 )
									ret := -0.769231 // sell
						if( VIP_VIM > 0.72721 )
							if( bearPower <= 1.91586 )
								if( bullPower <= 3.25765 )
									ret := 0.217391
								if( bullPower > 3.25765 )
									ret := -0.444444
							if( bearPower > 1.91586 )
								if( bbm <= 0.521782 )
									ret := -0.200000
								if( bbm > 0.521782 )
									ret := 0.761905 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_ADSK_15Min_1d6a29b5(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)

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


