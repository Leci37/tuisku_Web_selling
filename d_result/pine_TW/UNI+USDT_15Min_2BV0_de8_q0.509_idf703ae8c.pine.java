//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: UNIUSDT_15Min_2BV0_f703ae8c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2BV0_f703ae8c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_f703ae8c(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.073145 )
		if( VIP <= 0.872461 )
			if( VIP_VIM <= -0.330839 )
				if( bbm <= 0.262946 )
					if( bbp <= -0.559764 )
						if( bbp <= -0.960979 )
							if( bbp <= -1.08088 )
								ret := 1.000000 // buy
							if( bbp > -1.08088 )
								if( bearPower <= -0.602315 )
									ret := -0.600000
								if( bearPower > -0.602315 )
									ret := 1.000000 // buy
						if( bbp > -0.960979 )
							if( VIM <= 1.33657 )
								if( VIP <= 0.665234 )
									ret := -0.928571 // sell
								if( VIP > 0.665234 )
									ret := -0.481481
							if( VIM > 1.33657 )
								if( bbp <= -0.594954 )
									ret := -0.250000
								if( bbp > -0.594954 )
									ret := 1.000000 // buy
					if( bbp > -0.559764 )
						if( VIM <= 1.47043 )
							if( bearPower <= -0.263195 )
								if( bbp <= -0.423588 )
									ret := 0.169643
								if( bbp > -0.423588 )
									ret := 0.574586
							if( bearPower > -0.263195 )
								if( bbm <= 0.152682 )
									ret := 0.133147
								if( bbm > 0.152682 )
									ret := -0.169173
						if( VIM > 1.47043 )
							if( VIP_VIM <= -1.01501 )
								if( VIP <= 0.472843 )
									ret := 0.750000 // buy
								if( VIP > 0.472843 )
									ret := -0.250000
							if( VIP_VIM > -1.01501 )
								if( bearPower <= -0.206766 )
									ret := 0.571429
								if( bearPower > -0.206766 )
									ret := 0.975000 // buy
				if( bbm > 0.262946 )
					if( bbp <= -0.346535 )
						if( bbp <= -0.534663 )
							if( VIP <= 0.577513 )
								if( bearPower <= -1.03573 )
									ret := 0.200000
								if( bearPower > -1.03573 )
									ret := 0.944444 // buy
							if( VIP > 0.577513 )
								if( VIP_VIM <= -0.595719 )
									ret := -0.078947
								if( VIP_VIM > -0.595719 )
									ret := 0.569231
						if( bbp > -0.534663 )
							if( bullPower <= -0.025435 )
								if( bbp <= -0.481968 )
									ret := 1.000000 // buy
								if( bbp > -0.481968 )
									ret := 0.800000 // buy
							if( bullPower > -0.025435 )
								ret := 0.285714
					if( bbp > -0.346535 )
						if( VIP <= 0.703224 )
							if( VIM <= 1.06256 )
								ret := -0.714286 // sell
							if( VIM > 1.06256 )
								ret := 1.000000 // buy
						if( VIP > 0.703224 )
							if( VIP_VIM <= -0.426832 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.426832 )
								ret := -0.750000 // sell
			if( VIP_VIM > -0.330839 )
				if( VIM <= 1.13448 )
					if( bbp <= -0.177536 )
						if( bearPower <= -0.14598 )
							if( bullPower <= -0.016011 )
								if( VIP_VIM <= -0.31308 )
									ret := 0.790698 // buy
								if( VIP_VIM > -0.31308 )
									ret := 0.155556
							if( bullPower > -0.016011 )
								if( bbp <= -0.184921 )
									ret := -0.543860
								if( bbp > -0.184921 )
									ret := 0.000000
						if( bearPower > -0.14598 )
							if( bullPower <= -0.056622 )
								if( bearPower <= -0.124243 )
									ret := -0.939394 // sell
								if( bearPower > -0.124243 )
									ret := -0.200000
							if( bullPower > -0.056622 )
								if( VIM <= 1.12316 )
									ret := -0.107143
								if( VIM > 1.12316 )
									ret := -0.727273 // sell
					if( bbp > -0.177536 )
						if( bbp <= -0.129037 )
							if( bbm <= 0.116295 )
								if( bbp <= -0.168 )
									ret := -0.179487
								if( bbp > -0.168 )
									ret := 0.457895
							if( bbm > 0.116295 )
								if( bearPower <= -0.193927 )
									ret := -0.500000
								if( bearPower > -0.193927 )
									ret := 0.666667
						if( bbp > -0.129037 )
							if( VIP_VIM <= -0.251122 )
								if( bbm <= 0.049739 )
									ret := 0.866667 // buy
								if( bbm > 0.049739 )
									ret := -0.026110
							if( VIP_VIM > -0.251122 )
								if( bearPower <= -0.190625 )
									ret := -1.000000 // sell
								if( bearPower > -0.190625 )
									ret := 0.336117
				if( VIM > 1.13448 )
					if( bearPower <= -0.074573 )
						if( bearPower <= -0.096877 )
							if( VIP_VIM <= -0.291401 )
								if( bullPower <= -0.028372 )
									ret := 0.337838
								if( bullPower > -0.028372 )
									ret := -0.015625
							if( VIP_VIM > -0.291401 )
								if( bearPower <= -0.103958 )
									ret := 0.709091 // buy
								if( bearPower > -0.103958 )
									ret := 0.000000
						if( bearPower > -0.096877 )
							if( bbm <= 0.040029 )
								if( bbp <= -0.117321 )
									ret := 0.038462
								if( bbp > -0.117321 )
									ret := 0.600000
							if( bbm > 0.040029 )
								if( bbp <= -0.129419 )
									ret := 0.977273 // buy
								if( bbp > -0.129419 )
									ret := 0.496552
					if( bearPower > -0.074573 )
						if( bullPower <= -0.027478 )
							if( VIM <= 1.15266 )
								ret := 0.250000
							if( VIM > 1.15266 )
								ret := -1.000000 // sell
						if( bullPower > -0.027478 )
							if( VIM <= 1.15775 )
								if( bearPower <= -0.074047 )
									ret := -0.166667
								if( bearPower > -0.074047 )
									ret := 0.714286 // buy
							if( VIM > 1.15775 )
								ret := -0.666667
		if( VIP > 0.872461 )
			if( VIM <= 0.847011 )
				if( bullPower <= 0.299359 )
					if( bullPower <= 0.091761 )
						if( bearPower <= -0.08406 )
							if( VIP <= 1.11496 )
								ret := 0.200000
							if( VIP > 1.11496 )
								if( bbm <= 0.099324 )
									ret := 0.750000 // buy
								if( bbm > 0.099324 )
									ret := 1.000000 // buy
						if( bearPower > -0.08406 )
							ret := -0.142857
					if( bullPower > 0.091761 )
						ret := 1.000000 // buy
				if( bullPower > 0.299359 )
					if( VIM <= 0.682955 )
						ret := 1.000000 // buy
					if( VIM > 0.682955 )
						if( VIP_VIM <= 0.242106 )
							ret := 0.750000 // buy
						if( VIP_VIM > 0.242106 )
							ret := -1.000000 // sell
			if( VIM > 0.847011 )
				if( VIM <= 0.917686 )
					if( bullPower <= 0.093889 )
						if( bbp <= -0.014333 )
							if( bbp <= -0.039201 )
								if( VIP <= 1.20544 )
									ret := -0.585366
								if( VIP > 1.20544 )
									ret := 0.250000
							if( bbp > -0.039201 )
								if( VIP <= 1.14 )
									ret := 0.310345
								if( VIP > 1.14 )
									ret := -1.000000 // sell
						if( bbp > -0.014333 )
							if( VIP <= 1.02193 )
								ret := -0.750000 // sell
							if( VIP > 1.02193 )
								ret := -1.000000 // sell
					if( bullPower > 0.093889 )
						if( VIP <= 0.966072 )
							if( VIP <= 0.939789 )
								ret := -0.250000
							if( VIP > 0.939789 )
								ret := -1.000000 // sell
						if( VIP > 0.966072 )
							if( VIM <= 0.877052 )
								if( bearPower <= -0.13059 )
									ret := 0.750000 // buy
								if( bearPower > -0.13059 )
									ret := -0.529412
							if( VIM > 0.877052 )
								if( bbp <= 0.159862 )
									ret := 0.631579
								if( bbp > 0.159862 )
									ret := -0.500000
				if( VIM > 0.917686 )
					if( bbp <= -0.122207 )
						if( VIM <= 1.10155 )
							if( VIP_VIM <= -0.211635 )
								if( bullPower <= -0.032773 )
									ret := -0.974359 // sell
								if( bullPower > -0.032773 )
									ret := -0.307692
							if( VIP_VIM > -0.211635 )
								if( bearPower <= -0.236478 )
									ret := 0.343137
								if( bearPower > -0.236478 )
									ret := -0.102993
						if( VIM > 1.10155 )
							if( VIP_VIM <= -0.302837 )
								if( bbp <= -0.130888 )
									ret := -0.545455
								if( bbp > -0.130888 )
									ret := 0.428571
							if( VIP_VIM > -0.302837 )
								if( VIM <= 1.18938 )
									ret := 0.168317
								if( VIM > 1.18938 )
									ret := 0.769231 // buy
					if( bbp > -0.122207 )
						if( VIM <= 1.20652 )
							if( bbp <= -0.042693 )
								if( VIP_VIM <= -0.205513 )
									ret := -0.029586
								if( VIP_VIM > -0.205513 )
									ret := 0.155256
							if( bbp > -0.042693 )
								if( bullPower <= 0.08011 )
									ret := -0.312925
								if( bullPower > 0.08011 )
									ret := 0.182692
						if( VIM > 1.20652 )
							if( VIP_VIM <= -0.359464 )
								ret := -0.250000
							if( VIP_VIM > -0.359464 )
								if( VIM <= 1.25125 )
									ret := 0.958333 // buy
								if( VIM > 1.25125 )
									ret := 0.666667
	if( bearPower > -0.073145 )
		if( bbp <= 0.660603 )
			if( bbm <= 0.019145 )
				if( VIP_VIM <= 0.297925 )
					if( bbp <= 0.041391 )
						if( VIP_VIM <= -0.763068 )
							if( VIP <= 0.606352 )
								if( bullPower <= -0.015331 )
									ret := 0.200000
								if( bullPower > -0.015331 )
									ret := -0.750000 // sell
							if( VIP > 0.606352 )
								if( VIP <= 0.619515 )
									ret := 0.631579
								if( VIP > 0.619515 )
									ret := 0.153846
						if( VIP_VIM > -0.763068 )
							if( VIP_VIM <= -0.595956 )
								if( bullPower <= -0.020255 )
									ret := -0.383333
								if( bullPower > -0.020255 )
									ret := 0.009434
							if( VIP_VIM > -0.595956 )
								if( VIM <= 1.29042 )
									ret := -0.018922
								if( VIM > 1.29042 )
									ret := 0.252941
					if( bbp > 0.041391 )
						if( VIP <= 1.18634 )
							if( VIP_VIM <= -0.017501 )
								if( VIP_VIM <= -0.075718 )
									ret := 0.400000
								if( VIP_VIM > -0.075718 )
									ret := 0.833333 // buy
							if( VIP_VIM > -0.017501 )
								if( VIP <= 1.06699 )
									ret := -0.271429
								if( VIP > 1.06699 )
									ret := 0.131086
						if( VIP > 1.18634 )
							if( VIP_VIM <= 0.27937 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.27937 )
								ret := 0.750000 // buy
				if( VIP_VIM > 0.297925 )
					if( VIP_VIM <= 0.995833 )
						if( bbm <= 0.019011 )
							if( VIP <= 1.34694 )
								if( bbp <= 0.061743 )
									ret := 0.066609
								if( bbp > 0.061743 )
									ret := -0.033708
							if( VIP > 1.34694 )
								if( bullPower <= 0.027145 )
									ret := 0.000000
								if( bullPower > 0.027145 )
									ret := 0.277778
						if( bbm > 0.019011 )
							ret := 0.714286 // buy
					if( VIP_VIM > 0.995833 )
						if( bearPower <= 0.030473 )
							if( bbp <= 0.040104 )
								ret := 0.750000 // buy
							if( bbp > 0.040104 )
								ret := 1.000000 // buy
						if( bearPower > 0.030473 )
							if( VIP_VIM <= 1.08144 )
								ret := 0.166667
							if( VIP_VIM > 1.08144 )
								ret := 0.800000 // buy
			if( bbm > 0.019145 )
				if( bullPower <= 0.092563 )
					if( bbp <= -0.095999 )
						if( VIP_VIM <= -0.323269 )
							if( VIM <= 1.21745 )
								if( VIM <= 1.15126 )
									ret := 0.750000 // buy
								if( VIM > 1.15126 )
									ret := -0.214689
							if( VIM > 1.21745 )
								if( bearPower <= -0.069482 )
									ret := 0.032680
								if( bearPower > -0.069482 )
									ret := 0.363985
						if( VIP_VIM > -0.323269 )
							if( VIM <= 1.05427 )
								if( bearPower <= -0.068107 )
									ret := -0.266667
								if( bearPower > -0.068107 )
									ret := 0.600000
							if( VIM > 1.05427 )
								if( VIP <= 0.832794 )
									ret := 0.947368 // buy
								if( VIP > 0.832794 )
									ret := 0.370192
					if( bbp > -0.095999 )
						if( VIP <= 1.12602 )
							if( VIM <= 1.18386 )
								if( VIP <= 0.861455 )
									ret := -0.024609
								if( VIP > 0.861455 )
									ret := 0.037271
							if( VIM > 1.18386 )
								if( VIM <= 1.22643 )
									ret := 0.164995
								if( VIM > 1.22643 )
									ret := 0.004329
						if( VIP > 1.12602 )
							if( bearPower <= -0.026476 )
								if( VIP <= 1.17659 )
									ret := 0.204334
								if( VIP > 1.17659 )
									ret := 0.604317
							if( bearPower > -0.026476 )
								if( bbm <= 0.052074 )
									ret := 0.053151
								if( bbm > 0.052074 )
									ret := 0.140753
				if( bullPower > 0.092563 )
					if( VIM <= 0.663903 )
						if( VIP_VIM <= 0.620188 )
							if( VIP <= 1.20003 )
								if( VIP <= 1.09467 )
									ret := 0.875000 // buy
								if( VIP > 1.09467 )
									ret := -0.214286
							if( VIP > 1.20003 )
								if( bbm <= 0.081 )
									ret := -0.333333
								if( bbm > 0.081 )
									ret := 0.710280 // buy
						if( VIP_VIM > 0.620188 )
							if( bullPower <= 0.24557 )
								if( bbp <= 0.282312 )
									ret := 0.061078
								if( bbp > 0.282312 )
									ret := 0.364341
							if( bullPower > 0.24557 )
								if( bullPower <= 0.298342 )
									ret := -0.543860
								if( bullPower > 0.298342 )
									ret := 0.000000
					if( VIM > 0.663903 )
						if( bullPower <= 0.339231 )
							if( VIP <= 0.9218 )
								if( VIM <= 1.07784 )
									ret := -0.162791
								if( VIM > 1.07784 )
									ret := 0.703125 // buy
							if( VIP > 0.9218 )
								if( bbp <= 0.400874 )
									ret := -0.040189
								if( bbp > 0.400874 )
									ret := 0.231111
						if( bullPower > 0.339231 )
							if( bbm <= 0.152713 )
								ret := 1.000000 // buy
							if( bbm > 0.152713 )
								if( VIP_VIM <= 0.566594 )
									ret := -0.488000
								if( VIP_VIM > 0.566594 )
									ret := 0.250000
		if( bbp > 0.660603 )
			if( bullPower <= 0.666333 )
				if( VIP <= 1.1111 )
					if( bbm <= 0.311871 )
						ret := 0.500000
					if( bbm > 0.311871 )
						ret := -1.000000 // sell
				if( VIP > 1.1111 )
					if( bbm <= 0.094083 )
						ret := -1.000000 // sell
					if( bbm > 0.094083 )
						if( bbp <= 0.711113 )
							if( bearPower <= 0.231121 )
								if( VIM <= 0.51701 )
									ret := 1.000000 // buy
								if( VIM > 0.51701 )
									ret := -0.555556
							if( bearPower > 0.231121 )
								if( bullPower <= 0.414196 )
									ret := 1.000000 // buy
								if( bullPower > 0.414196 )
									ret := 0.571429
						if( bbp > 0.711113 )
							if( bbm <= 0.275043 )
								if( bbp <= 0.802052 )
									ret := 0.793103 // buy
								if( bbp > 0.802052 )
									ret := 0.979167 // buy
							if( bbm > 0.275043 )
								if( bbm <= 0.301966 )
									ret := -0.333333
								if( bbm > 0.301966 )
									ret := 0.828571 // buy
			if( bullPower > 0.666333 )
				if( VIP <= 1.42631 )
					if( bearPower <= 0.169592 )
						if( bbp <= 0.85187 )
							ret := -1.000000 // sell
						if( bbp > 0.85187 )
							ret := -0.250000
					if( bearPower > 0.169592 )
						if( VIP <= 1.25273 )
							if( bbm <= 0.43 )
								ret := 1.000000 // buy
							if( bbm > 0.43 )
								if( bearPower <= 0.31975 )
									ret := 0.800000 // buy
								if( bearPower > 0.31975 )
									ret := -0.600000
						if( VIP > 1.25273 )
							if( VIM <= 0.619666 )
								if( VIM <= 0.59384 )
									ret := 0.714286 // buy
								if( VIM > 0.59384 )
									ret := 0.000000
							if( VIM > 0.619666 )
								if( VIP <= 1.29114 )
									ret := -0.400000
								if( VIP > 1.29114 )
									ret := -1.000000 // sell
				if( VIP > 1.42631 )
					if( bearPower <= 1.56902 )
						ret := -1.000000 // sell
					if( bearPower > 1.56902 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_f703ae8c(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


