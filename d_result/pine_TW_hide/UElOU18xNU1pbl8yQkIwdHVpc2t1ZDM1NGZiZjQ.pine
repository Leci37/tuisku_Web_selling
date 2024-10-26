//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: PINS_15Min_2BB0_d354fbf4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2BB0_d354fbf4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_d354fbf4(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.13914 )
		if( Lower_Band <= 84.5504 )
			if( bbm <= 0.04984 )
				if( Lower_Band <= 14.9765 )
					if( bbp <= -0.74656 )
						if( bbp <= -0.970496 )
							ret := -1.000000 // sell
						if( bbp > -0.970496 )
							if( bullPower <= -0.4487 )
								ret := -0.666667
							if( bullPower > -0.4487 )
								ret := -1.000000 // sell
					if( bbp > -0.74656 )
						if( Upper_Band <= 11.2995 )
							ret := -1.000000 // sell
						if( Upper_Band > 11.2995 )
							if( Lower_Band <= 13.8605 )
								if( Lower_Band <= 12.0224 )
									ret := -0.142857
								if( Lower_Band > 12.0224 )
									ret := 0.833333 // buy
							if( Lower_Band > 13.8605 )
								if( bullPower <= -0.17798 )
									ret := -1.000000 // sell
								if( bullPower > -0.17798 )
									ret := -0.307692
				if( Lower_Band > 14.9765 )
					if( bearPower <= -0.105698 )
						if( Upper_Band <= 52.9748 )
							if( bbp <= -0.399335 )
								if( basis <= 28.0512 )
									ret := 0.603037
								if( basis > 28.0512 )
									ret := 0.313916
							if( bbp > -0.399335 )
								if( basis <= 28.5155 )
									ret := 0.267877
								if( basis > 28.5155 )
									ret := 0.390716
						if( Upper_Band > 52.9748 )
							if( bbp <= -2.13268 )
								if( basis <= 77.2508 )
									ret := 0.600000
								if( basis > 77.2508 )
									ret := 1.000000 // buy
							if( bbp > -2.13268 )
								if( basis <= 54.3372 )
									ret := -0.407407
								if( basis > 54.3372 )
									ret := 0.115207
					if( bearPower > -0.105698 )
						if( basis <= 20.2245 )
							if( Lower_Band <= 19.5745 )
								if( basis <= 19.5632 )
									ret := -0.155844
								if( basis > 19.5632 )
									ret := 0.571429
							if( Lower_Band > 19.5745 )
								if( Lower_Band <= 19.6181 )
									ret := -1.000000 // sell
								if( Lower_Band > 19.6181 )
									ret := -0.285714
						if( basis > 20.2245 )
							if( Upper_Band <= 22.7641 )
								if( Lower_Band <= 22.3948 )
									ret := 0.383562
								if( Lower_Band > 22.3948 )
									ret := 1.000000 // buy
							if( Upper_Band > 22.7641 )
								if( Upper_Band <= 24.6812 )
									ret := -0.090909
								if( Upper_Band > 24.6812 )
									ret := 0.169670
			if( bbm > 0.04984 )
				if( basis <= 85.061 )
					if( Upper_Band <= 81.3746 )
						if( bullPower <= -0.218686 )
							if( Lower_Band <= 26.5943 )
								if( Lower_Band <= 25.6829 )
									ret := 0.284547
								if( Lower_Band > 25.6829 )
									ret := 0.679325
							if( Lower_Band > 26.5943 )
								if( bbp <= -3.23004 )
									ret := 0.601449
								if( bbp > -3.23004 )
									ret := 0.115299
						if( bullPower > -0.218686 )
							if( basis <= 74.9407 )
								if( basis <= 73.8594 )
									ret := 0.075237
								if( basis > 73.8594 )
									ret := -0.622642
							if( basis > 74.9407 )
								if( bearPower <= -0.223351 )
									ret := 0.500000
								if( bearPower > -0.223351 )
									ret := -0.241379
					if( Upper_Band > 81.3746 )
						if( basis <= 81.5338 )
							if( bearPower <= -2.28356 )
								if( basis <= 78.4453 )
									ret := -0.444444
								if( basis > 78.4453 )
									ret := 0.842105 // buy
							if( bearPower > -2.28356 )
								if( bbp <= -0.801115 )
									ret := -0.705036 // sell
								if( bbp > -0.801115 )
									ret := -0.096774
						if( basis > 81.5338 )
							if( Upper_Band <= 84.5129 )
								if( bbm <= 1.235 )
									ret := 0.517857
								if( bbm > 1.235 )
									ret := -0.750000 // sell
							if( Upper_Band > 84.5129 )
								if( basis <= 83.9887 )
									ret := -0.355769
								if( basis > 83.9887 )
									ret := 0.217054
				if( basis > 85.061 )
					if( bearPower <= -2.64914 )
						ret := -0.200000
					if( bearPower > -2.64914 )
						if( Upper_Band <= 87.5169 )
							if( bullPower <= -0.000792 )
								if( bbp <= -2.55163 )
									ret := 1.000000 // buy
								if( bbp > -2.55163 )
									ret := 0.157895
							if( bullPower > -0.000792 )
								if( bbm <= 0.696258 )
									ret := 0.913043 // buy
								if( bbm > 0.696258 )
									ret := 0.250000
						if( Upper_Band > 87.5169 )
							if( Lower_Band <= 83.3175 )
								if( Lower_Band <= 82.2374 )
									ret := 1.000000 // buy
								if( Lower_Band > 82.2374 )
									ret := 0.200000
							if( Lower_Band > 83.3175 )
								if( bbp <= -0.506923 )
									ret := 0.973684 // buy
								if( bbp > -0.506923 )
									ret := 0.750000 // buy
		if( Lower_Band > 84.5504 )
			if( bbm <= 1.67352 )
				if( bearPower <= -0.27606 )
					if( basis <= 85.8454 )
						ret := -1.000000 // sell
					if( basis > 85.8454 )
						if( bbp <= -0.502919 )
							if( Upper_Band <= 87.9513 )
								if( Upper_Band <= 86.7719 )
									ret := -0.500000
								if( Upper_Band > 86.7719 )
									ret := -0.861111 // sell
							if( Upper_Band > 87.9513 )
								if( basis <= 87.8326 )
									ret := -0.333333
								if( basis > 87.8326 )
									ret := -1.000000 // sell
						if( bbp > -0.502919 )
							if( Lower_Band <= 85.4235 )
								ret := -0.200000
							if( Lower_Band > 85.4235 )
								ret := -0.500000
				if( bearPower > -0.27606 )
					ret := 0.285714
			if( bbm > 1.67352 )
				ret := 1.000000 // buy
	if( bbp > -0.13914 )
		if( bearPower <= 0.049292 )
			if( bullPower <= 0.408521 )
				if( bullPower <= -0.042487 )
					if( basis <= 20.207 )
						if( bullPower <= -0.04466 )
							if( basis <= 19.8577 )
								if( Lower_Band <= 18.7837 )
									ret := -0.277108
								if( Lower_Band > 18.7837 )
									ret := 0.205128
							if( basis > 19.8577 )
								if( basis <= 20.0229 )
									ret := -1.000000 // sell
								if( basis > 20.0229 )
									ret := 0.000000
						if( bullPower > -0.04466 )
							if( bullPower <= -0.044237 )
								ret := 1.000000 // buy
							if( bullPower > -0.044237 )
								if( bearPower <= -0.073299 )
									ret := -0.250000
								if( bearPower > -0.073299 )
									ret := 0.500000
					if( basis > 20.207 )
						if( Upper_Band <= 24.3511 )
							if( Lower_Band <= 23.6554 )
								if( Lower_Band <= 22.8336 )
									ret := 0.439189
								if( Lower_Band > 22.8336 )
									ret := -0.128205
							if( Lower_Band > 23.6554 )
								if( bearPower <= -0.066928 )
									ret := 0.750000 // buy
								if( bearPower > -0.066928 )
									ret := 0.966667 // buy
						if( Upper_Band > 24.3511 )
							if( Upper_Band <= 26.3849 )
								if( Lower_Band <= 24.7733 )
									ret := 0.233333
								if( Lower_Band > 24.7733 )
									ret := -0.348485
							if( Upper_Band > 26.3849 )
								if( bearPower <= -0.064068 )
									ret := 0.377143
								if( bearPower > -0.064068 )
									ret := 0.166181
				if( bullPower > -0.042487 )
					if( Upper_Band <= 61.747 )
						if( basis <= 26.2089 )
							if( Upper_Band <= 26.3188 )
								if( bbp <= -0.039464 )
									ret := -0.011671
								if( bbp > -0.039464 )
									ret := 0.070381
							if( Upper_Band > 26.3188 )
								if( bbm <= 0.249824 )
									ret := 0.231429
								if( bbm > 0.249824 )
									ret := 0.613636
						if( basis > 26.2089 )
							if( Upper_Band <= 28.3756 )
								if( bbm <= 0.240503 )
									ret := -0.033259
								if( bbm > 0.240503 )
									ret := -0.270115
							if( Upper_Band > 28.3756 )
								if( basis <= 28.9018 )
									ret := 0.183036
								if( basis > 28.9018 )
									ret := 0.007274
					if( Upper_Band > 61.747 )
						if( Upper_Band <= 68.6936 )
							if( bearPower <= -0.085463 )
								if( Lower_Band <= 60.5013 )
									ret := 0.789474 // buy
								if( Lower_Band > 60.5013 )
									ret := 0.347280
							if( bearPower > -0.085463 )
								if( bullPower <= 0.232239 )
									ret := 0.059574
								if( bullPower > 0.232239 )
									ret := 0.381443
						if( Upper_Band > 68.6936 )
							if( basis <= 85.4692 )
								if( Lower_Band <= 80.5081 )
									ret := 0.039543
								if( Lower_Band > 80.5081 )
									ret := 0.311111
							if( basis > 85.4692 )
								if( Lower_Band <= 85.2544 )
									ret := 0.347826
								if( Lower_Band > 85.2544 )
									ret := -0.676471
			if( bullPower > 0.408521 )
				if( basis <= 81.3061 )
					if( Upper_Band <= 56.6772 )
						if( Lower_Band <= 25.9984 )
							if( bearPower <= -0.223565 )
								if( basis <= 22.892 )
									ret := -0.578947
								if( basis > 22.892 )
									ret := -0.074074
							if( bearPower > -0.223565 )
								if( bbm <= 0.717207 )
									ret := 0.018868
								if( bbm > 0.717207 )
									ret := 0.549296
						if( Lower_Band > 25.9984 )
							if( bullPower <= 1.06981 )
								if( Upper_Band <= 50.44 )
									ret := -0.267290
								if( Upper_Band > 50.44 )
									ret := -0.654321
							if( bullPower > 1.06981 )
								if( Lower_Band <= 32.1439 )
									ret := -0.304348
								if( Lower_Band > 32.1439 )
									ret := 0.800000 // buy
					if( Upper_Band > 56.6772 )
						if( Upper_Band <= 78.1575 )
							if( basis <= 75.8782 )
								if( bbm <= 1.38905 )
									ret := 0.141337
								if( bbm > 1.38905 )
									ret := -0.241667
							if( basis > 75.8782 )
								if( Upper_Band <= 76.8231 )
									ret := -0.952381 // sell
								if( Upper_Band > 76.8231 )
									ret := -0.473684
						if( Upper_Band > 78.1575 )
							if( bearPower <= -0.498541 )
								if( Lower_Band <= 74.245 )
									ret := -0.666667
								if( Lower_Band > 74.245 )
									ret := 0.285714
							if( bearPower > -0.498541 )
								if( Upper_Band <= 81.2954 )
									ret := 0.769231 // buy
								if( Upper_Band > 81.2954 )
									ret := 0.090909
				if( basis > 81.3061 )
					if( Upper_Band <= 88.3048 )
						if( bearPower <= -0.118147 )
							if( Lower_Band <= 83.2456 )
								if( Lower_Band <= 80.6942 )
									ret := -0.250000
								if( Lower_Band > 80.6942 )
									ret := -0.911765 // sell
							if( Lower_Band > 83.2456 )
								if( basis <= 84.5805 )
									ret := 0.166667
								if( basis > 84.5805 )
									ret := -0.703704 // sell
						if( bearPower > -0.118147 )
							if( Upper_Band <= 85.3984 )
								if( bbp <= 0.572075 )
									ret := -0.111111
								if( bbp > 0.572075 )
									ret := 0.500000
							if( Upper_Band > 85.3984 )
								if( bullPower <= 0.602205 )
									ret := -0.357143
								if( bullPower > 0.602205 )
									ret := -0.857143 // sell
					if( Upper_Band > 88.3048 )
						if( bbm <= 0.70845 )
							ret := 0.500000
						if( bbm > 0.70845 )
							ret := 0.000000
		if( bearPower > 0.049292 )
			if( Lower_Band <= 16.2081 )
				if( Lower_Band <= 13.4115 )
					if( Lower_Band <= 12.1464 )
						if( basis <= 11.7748 )
							if( bbm <= 0.1044 )
								if( basis <= 11.4165 )
									ret := -0.900000 // sell
								if( basis > 11.4165 )
									ret := 1.000000 // buy
							if( bbm > 0.1044 )
								if( Upper_Band <= 12.6304 )
									ret := 0.944444 // buy
								if( Upper_Band > 12.6304 )
									ret := 0.400000
						if( basis > 11.7748 )
							if( bearPower <= 0.395937 )
								if( bullPower <= 0.187795 )
									ret := -0.111111
								if( bullPower > 0.187795 )
									ret := -0.839506 // sell
							if( bearPower > 0.395937 )
								if( basis <= 12.8111 )
									ret := -0.428571
								if( basis > 12.8111 )
									ret := 1.000000 // buy
					if( Lower_Band > 12.1464 )
						if( Upper_Band <= 15.0157 )
							if( bbp <= 0.602325 )
								if( bbm <= 0.12805 )
									ret := 0.970588 // buy
								if( bbm > 0.12805 )
									ret := 0.666667
							if( bbp > 0.602325 )
								if( bearPower <= 0.215903 )
									ret := -0.571429
								if( bearPower > 0.215903 )
									ret := 0.764706 // buy
						if( Upper_Band > 15.0157 )
							if( Lower_Band <= 13.1677 )
								ret := 0.000000
							if( Lower_Band > 13.1677 )
								if( bbm <= 0.140967 )
									ret := -1.000000 // sell
								if( bbm > 0.140967 )
									ret := -0.750000 // sell
				if( Lower_Band > 13.4115 )
					if( bearPower <= 0.061314 )
						if( bbm <= 0.006445 )
							ret := -0.750000 // sell
						if( bbm > 0.006445 )
							if( Lower_Band <= 15.8511 )
								if( basis <= 14.791 )
									ret := 0.250000
								if( basis > 14.791 )
									ret := -0.125000
							if( Lower_Band > 15.8511 )
								if( bearPower <= 0.059065 )
									ret := 0.500000
								if( bearPower > 0.059065 )
									ret := 1.000000 // buy
					if( bearPower > 0.061314 )
						if( bbm <= 0.27844 )
							if( bbp <= 0.672817 )
								if( Upper_Band <= 16.3301 )
									ret := -0.681416
								if( Upper_Band > 16.3301 )
									ret := -0.426471
							if( bbp > 0.672817 )
								ret := -1.000000 // sell
						if( bbm > 0.27844 )
							if( basis <= 15.4565 )
								if( bbp <= 0.597736 )
									ret := 0.285714
								if( bbp > 0.597736 )
									ret := 0.888889 // buy
							if( basis > 15.4565 )
								if( bbp <= 2.18647 )
									ret := -0.250000
								if( bbp > 2.18647 )
									ret := -0.909091 // sell
			if( Lower_Band > 16.2081 )
				if( bbm <= 0.078912 )
					if( bbp <= 0.604515 )
						if( Lower_Band <= 17.3923 )
							if( bearPower <= 0.070881 )
								if( bbm <= 0.01005 )
									ret := -0.769231 // sell
								if( bbm > 0.01005 )
									ret := 0.583333
							if( bearPower > 0.070881 )
								if( Upper_Band <= 17.6954 )
									ret := -0.346154
								if( Upper_Band > 17.6954 )
									ret := -0.830189 // sell
						if( Lower_Band > 17.3923 )
							if( basis <= 17.7055 )
								if( Lower_Band <= 17.4341 )
									ret := 1.000000 // buy
								if( Lower_Band > 17.4341 )
									ret := 0.750000 // buy
							if( basis > 17.7055 )
								if( Upper_Band <= 72.0735 )
									ret := -0.091035
								if( Upper_Band > 72.0735 )
									ret := 0.154812
					if( bbp > 0.604515 )
						if( basis <= 25.6128 )
							if( basis <= 21.5858 )
								if( bullPower <= 0.331609 )
									ret := -0.500000
								if( bullPower > 0.331609 )
									ret := -0.957447 // sell
							if( basis > 21.5858 )
								if( Upper_Band <= 23.1662 )
									ret := 0.500000
								if( Upper_Band > 23.1662 )
									ret := -0.724638 // sell
						if( basis > 25.6128 )
							if( bullPower <= 0.591447 )
								if( basis <= 32.3482 )
									ret := -0.297619
								if( basis > 32.3482 )
									ret := -0.081818
							if( bullPower > 0.591447 )
								if( Upper_Band <= 77.1683 )
									ret := -0.537815
								if( Upper_Band > 77.1683 )
									ret := 0.357143
				if( bbm > 0.078912 )
					if( Upper_Band <= 19.9929 )
						if( bbm <= 0.206087 )
							if( Lower_Band <= 16.4584 )
								if( bullPower <= 0.430554 )
									ret := 0.829268 // buy
								if( bullPower > 0.430554 )
									ret := -0.166667
							if( Lower_Band > 16.4584 )
								if( basis <= 18.2692 )
									ret := 0.219512
								if( basis > 18.2692 )
									ret := -0.041379
						if( bbm > 0.206087 )
							if( Lower_Band <= 16.3329 )
								ret := -0.833333 // sell
							if( Lower_Band > 16.3329 )
								if( bbp <= 0.593984 )
									ret := 0.298851
								if( bbp > 0.593984 )
									ret := 0.682927
					if( Upper_Band > 19.9929 )
						if( bbm <= 0.46995 )
							if( Upper_Band <= 60.1538 )
								if( Upper_Band <= 24.3852 )
									ret := -0.034732
								if( Upper_Band > 24.3852 )
									ret := 0.051124
							if( Upper_Band > 60.1538 )
								if( Upper_Band <= 71.9819 )
									ret := -0.129101
								if( Upper_Band > 71.9819 )
									ret := 0.036088
						if( bbm > 0.46995 )
							if( basis <= 37.4652 )
								if( Upper_Band <= 35.8324 )
									ret := -0.171216
								if( Upper_Band > 35.8324 )
									ret := -0.656863
							if( basis > 37.4652 )
								if( basis <= 39.2567 )
									ret := 0.857143 // buy
								if( basis > 39.2567 )
									ret := -0.051376
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_PINS_15Min_d354fbf4(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


