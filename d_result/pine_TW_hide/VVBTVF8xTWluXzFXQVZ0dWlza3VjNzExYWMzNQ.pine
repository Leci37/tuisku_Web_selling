//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: UPST_1Min_1WAV_c711ac35 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1WAV_c711ac35", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_c711ac35(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ci <= -116.246 )
		if( ci_wt2 <= -115.049 )
			if( ci <= -169.85 )
				if( ap <= 28.2051 )
					if( wt2 <= 32.7059 )
						if( tci <= -6.76994 )
							if( ci_wt2 <= -164.446 )
								if( ap <= 24.5917 )
									ret := 0.250000
								if( ap > 24.5917 )
									ret := 0.640000
							if( ci_wt2 > -164.446 )
								if( tci <= -46.5928 )
									ret := 0.555556
								if( tci > -46.5928 )
									ret := 0.929577 // buy
						if( tci > -6.76994 )
							if( ci_wt2 <= -211.558 )
								ret := 1.000000 // buy
							if( ci_wt2 > -211.558 )
								if( tci <= 0.066495 )
									ret := 0.937500 // buy
								if( tci > 0.066495 )
									ret := 0.750000 // buy
					if( wt2 > 32.7059 )
						ret := 0.150000
				if( ap > 28.2051 )
					if( d <= 0.249911 )
						if( wt2 <= -27.5313 )
							if( tci <= -62.1614 )
								ret := 1.000000 // buy
							if( tci > -62.1614 )
								if( wt2 <= -41.2984 )
									ret := -0.166667
								if( wt2 > -41.2984 )
									ret := 0.740741 // buy
						if( wt2 > -27.5313 )
							if( esa <= 33.0573 )
								if( d <= 0.048462 )
									ret := -0.857143 // sell
								if( d > 0.048462 )
									ret := 0.187500
							if( esa > 33.0573 )
								if( tci <= -36.9447 )
									ret := -0.529412
								if( tci > -36.9447 )
									ret := 0.432624
					if( d > 0.249911 )
						ret := -1.000000 // sell
			if( ci > -169.85 )
				if( ci <= -159.322 )
					if( d <= 0.190965 )
						if( d <= 0.135804 )
							if( wt2 <= -26.6428 )
								if( d_tci <= 49.4834 )
									ret := 0.708333 // buy
								if( d_tci > 49.4834 )
									ret := -0.136364
							if( wt2 > -26.6428 )
								if( tci <= -22.8904 )
									ret := -0.756410 // sell
								if( tci > -22.8904 )
									ret := -0.012903
						if( d > 0.135804 )
							if( d_tci <= 53.7431 )
								ret := -0.625000
							if( d_tci > 53.7431 )
								ret := -0.454545
					if( d > 0.190965 )
						ret := 1.000000 // buy
				if( ci > -159.322 )
					if( esa <= 40.6818 )
						if( d_tci <= 42.019 )
							if( ci <= -126.524 )
								if( ap <= 23.3304 )
									ret := 0.426523
								if( ap > 23.3304 )
									ret := 0.202938
							if( ci > -126.524 )
								if( d <= 0.024211 )
									ret := -0.022727
								if( d > 0.024211 )
									ret := 0.458259
						if( d_tci > 42.019 )
							if( ap <= 36.054 )
								if( esa <= 24.4312 )
									ret := 0.555556
								if( esa > 24.4312 )
									ret := 0.963636 // buy
							if( ap > 36.054 )
								ret := -0.222222
					if( esa > 40.6818 )
						if( d_tci <= -16.9756 )
							if( wt2 <= 37.797 )
								ret := 0.909091 // buy
							if( wt2 > 37.797 )
								ret := 0.538462
						if( d_tci > -16.9756 )
							if( esa <= 40.7961 )
								ret := -0.647059
							if( esa > 40.7961 )
								if( esa <= 43.4659 )
									ret := 0.075188
								if( esa > 43.4659 )
									ret := -0.267857
		if( ci_wt2 > -115.049 )
			if( ci_wt2 <= -108.362 )
				if( d_tci <= 53.4786 )
					if( ci <= -117.632 )
						if( tci <= -46.571 )
							if( tci <= -51.6496 )
								ret := -0.416667
							if( tci > -51.6496 )
								if( wt2 <= -33.2851 )
									ret := -0.906250 // sell
								if( wt2 > -33.2851 )
									ret := -1.000000 // sell
						if( tci > -46.571 )
							if( tci <= -32.3689 )
								if( tci <= -39.2776 )
									ret := -0.285714
								if( tci > -39.2776 )
									ret := 0.487805
							if( tci > -32.3689 )
								if( ap <= 41.3176 )
									ret := -0.618497
								if( ap > 41.3176 )
									ret := 0.000000
					if( ci > -117.632 )
						ret := 0.615385
				if( d_tci > 53.4786 )
					if( wt2 <= -46.3098 )
						ret := 0.923077 // buy
					if( wt2 > -46.3098 )
						ret := 0.647059
			if( ci_wt2 > -108.362 )
				if( tci <= -60.8651 )
					if( wt2 <= -50.727 )
						if( ci_wt2 <= -64.6959 )
							if( tci <= -65.6457 )
								if( tci <= -71.8854 )
									ret := 0.481481
								if( tci > -71.8854 )
									ret := 0.850000 // buy
							if( tci > -65.6457 )
								if( ap <= 33.5104 )
									ret := -0.094595
								if( ap > 33.5104 )
									ret := 0.785714 // buy
						if( ci_wt2 > -64.6959 )
							if( ci <= -122.592 )
								if( ap <= 27.6242 )
									ret := 0.230769
								if( ap > 27.6242 )
									ret := -0.736842 // sell
							if( ci > -122.592 )
								if( ap <= 38.2182 )
									ret := 0.506494
								if( ap > 38.2182 )
									ret := -0.583333
					if( wt2 > -50.727 )
						if( esa <= 31.6089 )
							ret := 0.727273 // buy
						if( esa > 31.6089 )
							if( tci <= -62.6632 )
								ret := 0.888889 // buy
							if( tci > -62.6632 )
								ret := 1.000000 // buy
				if( tci > -60.8651 )
					if( ci <= -116.574 )
						if( wt2 <= -49.6565 )
							if( ci_wt2 <= -83.523 )
								ret := 0.937500 // buy
							if( ci_wt2 > -83.523 )
								if( d_tci <= 60.4616 )
									ret := 0.722222 // buy
								if( d_tci > 60.4616 )
									ret := -0.333333
						if( wt2 > -49.6565 )
							if( ci_wt2 <= -80.2249 )
								if( wt2 <= -47.1129 )
									ret := -0.697674
								if( wt2 > -47.1129 )
									ret := 0.031212
							if( ci_wt2 > -80.2249 )
								if( d_tci <= 55.2692 )
									ret := 0.516129
								if( d_tci > 55.2692 )
									ret := -0.200000
					if( ci > -116.574 )
						if( tci <= -39.7433 )
							ret := 0.333333
						if( tci > -39.7433 )
							ret := 0.764706 // buy
	if( ci > -116.246 )
		if( d <= 0.034394 )
			if( ci <= -97.7858 )
				if( ci_wt2 <= -120.137 )
					if( ci <= -99.5442 )
						if( ci_wt2 <= -123.331 )
							if( d_tci <= -15.3273 )
								if( ap <= 23.5809 )
									ret := 0.086957
								if( ap > 23.5809 )
									ret := 0.740741 // buy
							if( d_tci > -15.3273 )
								if( d <= 0.025062 )
									ret := 0.375000
								if( d > 0.025062 )
									ret := 0.032258
						if( ci_wt2 > -123.331 )
							ret := 0.727273 // buy
					if( ci > -99.5442 )
						if( d <= 0.026797 )
							ret := 0.571429
						if( d > 0.026797 )
							ret := 1.000000 // buy
				if( ci_wt2 > -120.137 )
					if( ci <= -102.397 )
						if( wt2 <= -33.1813 )
							if( ci <= -106.626 )
								if( ci <= -108.173 )
									ret := -0.102564
								if( ci > -108.173 )
									ret := -0.555556
							if( ci > -106.626 )
								if( ap <= 23.1345 )
									ret := 0.181818
								if( ap > 23.1345 )
									ret := 0.071429
						if( wt2 > -33.1813 )
							if( ci_wt2 <= -91.9034 )
								if( ci_wt2 <= -103.476 )
									ret := 0.196262
								if( ci_wt2 > -103.476 )
									ret := -0.111111
							if( ci_wt2 > -91.9034 )
								if( tci <= -27.2319 )
									ret := 0.144444
								if( tci > -27.2319 )
									ret := 0.682927
					if( ci > -102.397 )
						if( ap <= 34.7375 )
							if( ci_wt2 <= -70.7451 )
								if( ci_wt2 <= -86.5828 )
									ret := -0.054054
								if( ci_wt2 > -86.5828 )
									ret := -0.425000
							if( ci_wt2 > -70.7451 )
								if( wt2 <= -31.807 )
									ret := 0.000000
								if( wt2 > -31.807 )
									ret := 0.454545
						if( ap > 34.7375 )
							ret := 0.363636
			if( ci > -97.7858 )
				if( ap <= 37.1169 )
					if( ci_wt2 <= -118.231 )
						if( ap <= 23.6082 )
							if( wt2 <= 37.1541 )
								if( ci <= -88.1253 )
									ret := 0.222222
								if( ci > -88.1253 )
									ret := 0.875000 // buy
							if( wt2 > 37.1541 )
								if( d_tci <= -35.6422 )
									ret := 0.500000
								if( d_tci > -35.6422 )
									ret := -0.047619
						if( ap > 23.6082 )
							if( ci <= -81.9734 )
								if( wt2 <= 53.4202 )
									ret := 0.657143
								if( wt2 > 53.4202 )
									ret := 0.941176 // buy
							if( ci > -81.9734 )
								ret := 0.000000
					if( ci_wt2 > -118.231 )
						if( esa <= 36.463 )
							if( ci <= -70.6454 )
								if( esa <= 21.5752 )
									ret := 0.416667
								if( esa > 21.5752 )
									ret := -0.056358
							if( ci > -70.6454 )
								if( ci_wt2 <= -31.3511 )
									ret := 0.096524
								if( ci_wt2 > -31.3511 )
									ret := 0.015265
						if( esa > 36.463 )
							if( esa <= 36.5267 )
								ret := -0.722222 // sell
							if( esa > 36.5267 )
								if( ci <= -21.8287 )
									ret := 0.029412
								if( ci > -21.8287 )
									ret := -0.266055
				if( ap > 37.1169 )
					if( esa <= 39.8295 )
						if( ci_wt2 <= 74.168 )
							if( tci <= -10.6527 )
								if( ap <= 38.525 )
									ret := 0.285714
								if( ap > 38.525 )
									ret := -0.108434
							if( tci > -10.6527 )
								if( ci <= 28.226 )
									ret := 0.383721
								if( ci > 28.226 )
									ret := 0.186869
						if( ci_wt2 > 74.168 )
							if( ci_wt2 <= 83.7705 )
								ret := 0.909091 // buy
							if( ci_wt2 > 83.7705 )
								if( esa <= 39.5263 )
									ret := 0.313131
								if( esa > 39.5263 )
									ret := 0.812500 // buy
					if( esa > 39.8295 )
						if( d <= 0.020921 )
							if( wt2 <= 13.0668 )
								if( d_tci <= -5.86645 )
									ret := 0.125000
								if( d_tci > -5.86645 )
									ret := 0.479167
							if( wt2 > 13.0668 )
								if( ap <= 43.0865 )
									ret := 0.000000
								if( ap > 43.0865 )
									ret := -0.181818
						if( d > 0.020921 )
							if( ci <= 81.6589 )
								if( wt2 <= 7.72552 )
									ret := 0.120448
								if( wt2 > 7.72552 )
									ret := -0.101322
							if( ci > 81.6589 )
								if( ci <= 89.2992 )
									ret := -0.642857
								if( ci > 89.2992 )
									ret := -0.226415
		if( d > 0.034394 )
			if( ci <= 91.1352 )
				if( esa <= 23.5256 )
					if( wt2 <= -74.4865 )
						if( ci_wt2 <= 16.9636 )
							ret := 0.600000
						if( ci_wt2 > 16.9636 )
							if( ap <= 22.2774 )
								ret := 1.000000 // buy
							if( ap > 22.2774 )
								ret := 0.823529 // buy
					if( wt2 > -74.4865 )
						if( tci <= 70.5497 )
							if( ap <= 22.0968 )
								if( d <= 0.188112 )
									ret := 0.162207
								if( d > 0.188112 )
									ret := 0.801802 // buy
							if( ap > 22.0968 )
								if( ap <= 22.1456 )
									ret := -0.258278
								if( ap > 22.1456 )
									ret := 0.060972
						if( tci > 70.5497 )
							if( ci <= 32.2426 )
								ret := 0.538462
							if( ci > 32.2426 )
								if( ci <= 83.3587 )
									ret := -0.617647
								if( ci > 83.3587 )
									ret := 0.500000
				if( esa > 23.5256 )
					if( tci <= -68.0709 )
						if( ci_wt2 <= 1.10973 )
							if( d_tci <= 80.128 )
								if( ci <= -68.6559 )
									ret := -0.159618
								if( ci > -68.6559 )
									ret := 1.000000 // buy
							if( d_tci > 80.128 )
								if( d_tci <= 81.8639 )
									ret := 0.615385
								if( d_tci > 81.8639 )
									ret := 0.965517 // buy
						if( ci_wt2 > 1.10973 )
							if( d <= 0.116611 )
								if( ci <= -40.6622 )
									ret := -0.426471
								if( ci > -40.6622 )
									ret := -0.884615 // sell
							if( d > 0.116611 )
								if( wt2 <= -67.7113 )
									ret := -0.249300
								if( wt2 > -67.7113 )
									ret := -1.000000 // sell
					if( tci > -68.0709 )
						if( ci_wt2 <= -138.194 )
							if( ci <= -103.972 )
								if( ci <= -112.443 )
									ret := 0.254902
								if( ci > -112.443 )
									ret := 0.775194 // buy
							if( ci > -103.972 )
								if( ci_wt2 <= -152.888 )
									ret := -0.578947
								if( ci_wt2 > -152.888 )
									ret := 0.171429
						if( ci_wt2 > -138.194 )
							if( ap <= 30.822 )
								if( wt2 <= 10.8843 )
									ret := 0.008343
								if( wt2 > 10.8843 )
									ret := -0.111679
							if( ap > 30.822 )
								if( d <= 0.245407 )
									ret := -0.004558
								if( d > 0.245407 )
									ret := 0.229744
			if( ci > 91.1352 )
				if( d_tci <= -31.0861 )
					if( ci_wt2 <= 140.955 )
						if( wt2 <= 70.9 )
							if( esa <= 21.3739 )
								if( ci_wt2 <= 76.3158 )
									ret := 0.894737 // buy
								if( ci_wt2 > 76.3158 )
									ret := 0.125000
							if( esa > 21.3739 )
								if( wt2 <= 65.9993 )
									ret := -0.056773
								if( wt2 > 65.9993 )
									ret := -0.345455
						if( wt2 > 70.9 )
							if( d <= 0.12149 )
								if( ap <= 24.0552 )
									ret := -0.550000
								if( ap > 24.0552 )
									ret := 0.214286
							if( d > 0.12149 )
								if( wt2 <= 73.946 )
									ret := 0.795455 // buy
								if( wt2 > 73.946 )
									ret := 0.333333
					if( ci_wt2 > 140.955 )
						if( d <= 0.063852 )
							if( d <= 0.037508 )
								ret := -0.764706 // sell
							if( d > 0.037508 )
								if( esa <= 24.7091 )
									ret := -0.656250
								if( esa > 24.7091 )
									ret := 0.282609
						if( d > 0.063852 )
							if( ci <= 236.011 )
								if( esa <= 40.6915 )
									ret := -0.944444 // sell
								if( esa > 40.6915 )
									ret := -0.636364
							if( ci > 236.011 )
								if( wt2 <= 27.9415 )
									ret := -0.782609 // sell
								if( wt2 > 27.9415 )
									ret := 0.052632
				if( d_tci > -31.0861 )
					if( ci_wt2 <= 194.209 )
						if( wt2 <= -50.2835 )
							if( ci <= 106.485 )
								if( ci_wt2 <= 156.62 )
									ret := -0.500000
								if( ci_wt2 > 156.62 )
									ret := 0.071429
							if( ci > 106.485 )
								if( esa <= 24.244 )
									ret := -0.888889 // sell
								if( esa > 24.244 )
									ret := -1.000000 // sell
						if( wt2 > -50.2835 )
							if( wt2 <= -39.9269 )
								if( wt2 <= -41.4231 )
									ret := 0.087302
								if( wt2 > -41.4231 )
									ret := 0.687500
							if( wt2 > -39.9269 )
								if( tci <= -13.2794 )
									ret := -0.469101
								if( tci > -13.2794 )
									ret := -0.204136
					if( ci_wt2 > 194.209 )
						if( ci <= 180.322 )
							if( d_tci <= 28.9113 )
								if( wt2 <= -36.091 )
									ret := 0.681818
								if( wt2 > -36.091 )
									ret := -0.650000
							if( d_tci > 28.9113 )
								ret := -1.000000 // sell
						if( ci > 180.322 )
							if( d <= 0.078671 )
								if( d <= 0.073136 )
									ret := -0.672131
								if( d > 0.073136 )
									ret := 0.428571
							if( d > 0.078671 )
								if( d <= 0.114844 )
									ret := -0.969697 // sell
								if( d > 0.114844 )
									ret := -0.434783
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_UPST_1Min_c711ac35(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


