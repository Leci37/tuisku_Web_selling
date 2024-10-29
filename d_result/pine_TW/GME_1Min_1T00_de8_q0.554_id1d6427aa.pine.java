//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: GME_1Min_1T00_1d6427aa Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1T00_1d6427aa", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_1d6427aa(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.053585 )
		if( tema <= 21.4904 )
			if( ema12 <= -0.040335 )
				if( ema2 <= 21.1938 )
					if( tema <= 20.5358 )
						if( ema3 <= 20.0121 )
							if( ema2 <= 19.7495 )
								if( ema2 <= 11.6955 )
									ret := 0.647727
								if( ema2 > 11.6955 )
									ret := 0.119758
							if( ema2 > 19.7495 )
								if( ema12 <= -0.051818 )
									ret := -0.568182
								if( ema12 > -0.051818 )
									ret := 0.361702
						if( ema3 > 20.0121 )
							if( ema1 <= 20.0984 )
								if( ema2 <= 20.029 )
									ret := 0.962963 // buy
								if( ema2 > 20.029 )
									ret := 0.737705 // buy
							if( ema1 > 20.0984 )
								if( ema3 <= 20.2552 )
									ret := -0.377358
								if( ema3 > 20.2552 )
									ret := 0.426644
					if( tema > 20.5358 )
						if( ema12 <= -0.071591 )
							if( ema12 <= -0.1597 )
								ret := 1.000000 // buy
							if( ema12 > -0.1597 )
								if( ema2 <= 20.8717 )
									ret := -0.855422 // sell
								if( ema2 > 20.8717 )
									ret := -0.364486
						if( ema12 > -0.071591 )
							if( tema <= 20.9667 )
								if( ema1 <= 21.0369 )
									ret := 0.415808
								if( ema1 > 21.0369 )
									ret := -0.800000 // sell
							if( tema > 20.9667 )
								if( ema1 <= 21.0751 )
									ret := -0.613636
								if( ema1 > 21.0751 )
									ret := 0.108696
				if( ema2 > 21.1938 )
					if( tema <= 21.3606 )
						if( ema13 <= -0.566537 )
							ret := 1.000000 // buy
						if( ema13 > -0.566537 )
							if( ema1 <= 21.0874 )
								ret := -0.277778
							if( ema1 > 21.0874 )
								if( ema13 <= -0.087046 )
									ret := 0.469203
								if( ema13 > -0.087046 )
									ret := 0.203125
					if( tema > 21.3606 )
						if( ema3 <= 21.6729 )
							if( tema <= 21.438 )
								if( ema2 <= 21.5538 )
									ret := 0.054054
								if( ema2 > 21.5538 )
									ret := -0.921053 // sell
							if( tema > 21.438 )
								ret := 0.296296
						if( ema3 > 21.6729 )
							if( tema <= 21.4176 )
								if( ema1 <= 21.5319 )
									ret := 0.320000
								if( ema1 > 21.5319 )
									ret := -0.214286
							if( tema > 21.4176 )
								if( ema13 <= -0.130843 )
									ret := 0.326531
								if( ema13 > -0.130843 )
									ret := 0.944444 // buy
			if( ema12 > -0.040335 )
				if( ema2 <= 21.1877 )
					if( ema3 <= 21.0304 )
						if( ema13 <= -0.03206 )
							if( ema13 <= -0.107082 )
								if( ema13 <= -0.118854 )
									ret := 0.000000
								if( ema13 > -0.118854 )
									ret := 0.902439 // buy
							if( ema13 > -0.107082 )
								if( ema2 <= 11.6935 )
									ret := 0.147186
								if( ema2 > 11.6935 )
									ret := -0.077197
						if( ema13 > -0.03206 )
							if( ema1 <= 21.0827 )
								if( ema2 <= 21.0197 )
									ret := 0.053675
								if( ema2 > 21.0197 )
									ret := 0.400000
							if( ema1 > 21.0827 )
								if( tema <= 21.1611 )
									ret := -0.894737 // sell
								if( tema > 21.1611 )
									ret := -0.444444
					if( ema3 > 21.0304 )
						if( ema12 <= -0.023812 )
							if( ema1 <= 21.033 )
								if( ema12 <= -0.026748 )
									ret := -0.522727
								if( ema12 > -0.026748 )
									ret := 0.000000
							if( ema1 > 21.033 )
								if( ema12 <= -0.033497 )
									ret := -0.162162
								if( ema12 > -0.033497 )
									ret := 0.534653
						if( ema12 > -0.023812 )
							if( ema3 <= 21.0955 )
								if( ema3 <= 21.0621 )
									ret := -0.231429
								if( ema3 > 21.0621 )
									ret := -0.434164
							if( ema3 > 21.0955 )
								if( ema3 <= 21.1343 )
									ret := 0.048319
								if( ema3 > 21.1343 )
									ret := -0.324324
				if( ema2 > 21.1877 )
					if( ema13 <= -0.042913 )
						if( ema2 <= 21.2806 )
							if( ema1 <= 21.1738 )
								ret := 0.272727
							if( ema1 > 21.1738 )
								if( ema2 <= 21.2032 )
									ret := 1.000000 // buy
								if( ema2 > 21.2032 )
									ret := 0.712329 // buy
						if( ema2 > 21.2806 )
							if( ema1 <= 21.2847 )
								ret := -0.476190
							if( ema1 > 21.2847 )
								if( ema3 <= 21.4684 )
									ret := 0.568345
								if( ema3 > 21.4684 )
									ret := 0.144828
					if( ema13 > -0.042913 )
						if( ema1 <= 21.2216 )
							if( ema2 <= 21.2318 )
								if( ema12 <= -0.017596 )
									ret := -0.352941
								if( ema12 > -0.017596 )
									ret := 0.576355
							if( ema2 > 21.2318 )
								ret := 0.944444 // buy
						if( ema1 > 21.2216 )
							if( ema3 <= 21.5017 )
								if( ema2 <= 21.4924 )
									ret := 0.053677
								if( ema2 > 21.4924 )
									ret := -0.739130 // sell
							if( ema3 > 21.5017 )
								if( ema2 <= 21.5715 )
									ret := 0.365672
								if( ema2 > 21.5715 )
									ret := 0.923077 // buy
		if( tema > 21.4904 )
			if( ema12 <= -1.07297 )
				if( tema <= 59.3797 )
					if( tema <= 45.723 )
						if( ema1 <= 45.8019 )
							if( tema <= 34.87 )
								if( ema3 <= 38.4211 )
									ret := 0.287671
								if( ema3 > 38.4211 )
									ret := 1.000000 // buy
							if( tema > 34.87 )
								if( ema1 <= 38.5166 )
									ret := -1.000000 // sell
								if( ema1 > 38.5166 )
									ret := 0.420290
						if( ema1 > 45.8019 )
							ret := -1.000000 // sell
					if( tema > 45.723 )
						if( ema13 <= -2.12388 )
							if( ema2 <= 64.2877 )
								if( ema13 <= -6.37843 )
									ret := 1.000000 // buy
								if( ema13 > -6.37843 )
									ret := 0.850000 // buy
							if( ema2 > 64.2877 )
								ret := 0.428571
						if( ema13 > -2.12388 )
							if( ema12 <= -1.16696 )
								ret := 0.076923
							if( ema12 > -1.16696 )
								if( ema13 <= -1.97635 )
									ret := 1.000000 // buy
								if( ema13 > -1.97635 )
									ret := 0.200000
				if( tema > 59.3797 )
					if( ema1 <= 70.3811 )
						ret := -1.000000 // sell
					if( ema1 > 70.3811 )
						ret := -0.500000
			if( ema12 > -1.07297 )
				if( tema <= 29.7519 )
					if( tema <= 24.8844 )
						if( ema1 <= 24.5618 )
							if( ema2 <= 24.5173 )
								if( ema2 <= 24.4733 )
									ret := -0.006181
								if( ema2 > 24.4733 )
									ret := -0.185249
							if( ema2 > 24.5173 )
								if( ema2 <= 24.6009 )
									ret := 0.267901
								if( ema2 > 24.6009 )
									ret := -0.282828
						if( ema1 > 24.5618 )
							if( ema12 <= 0.034814 )
								if( ema2 <= 25.0225 )
									ret := -0.104924
								if( ema2 > 25.0225 )
									ret := 0.345455
							if( ema12 > 0.034814 )
								if( ema2 <= 24.7872 )
									ret := -0.648515
								if( ema2 > 24.7872 )
									ret := 0.416667
					if( tema > 24.8844 )
						if( ema3 <= 31.2349 )
							if( ema12 <= -0.126141 )
								if( ema2 <= 26.5115 )
									ret := 0.412879
								if( ema2 > 26.5115 )
									ret := 0.121561
							if( ema12 > -0.126141 )
								if( ema13 <= -0.267049 )
									ret := -0.519481
								if( ema13 > -0.267049 )
									ret := 0.024137
						if( ema3 > 31.2349 )
							if( ema12 <= -0.796085 )
								if( ema2 <= 31.2054 )
									ret := -1.000000 // sell
								if( ema2 > 31.2054 )
									ret := -0.727273 // sell
							if( ema12 > -0.796085 )
								ret := -0.272727
				if( tema > 29.7519 )
					if( ema1 <= 30.1285 )
						if( tema <= 29.8859 )
							if( ema3 <= 29.8338 )
								if( ema3 <= 29.8236 )
									ret := -0.089744
								if( ema3 > 29.8236 )
									ret := 0.687500
							if( ema3 > 29.8338 )
								if( ema2 <= 29.9782 )
									ret := -0.609626
								if( ema2 > 29.9782 )
									ret := 0.000000
						if( tema > 29.8859 )
							if( ema13 <= 0.009248 )
								if( ema13 <= -0.071067 )
									ret := -0.706294 // sell
								if( ema13 > -0.071067 )
									ret := -0.962500 // sell
							if( ema13 > 0.009248 )
								if( ema13 <= 0.032483 )
									ret := 0.772727 // buy
								if( ema13 > 0.032483 )
									ret := -0.509804
					if( ema1 > 30.1285 )
						if( ema3 <= 30.1544 )
							if( ema12 <= 0.020968 )
								ret := -1.000000 // sell
							if( ema12 > 0.020968 )
								if( ema2 <= 30.1644 )
									ret := 0.222222
								if( ema2 > 30.1644 )
									ret := -0.846154 // sell
						if( ema3 > 30.1544 )
							if( ema3 <= 30.2327 )
								if( ema1 <= 30.2377 )
									ret := 0.788889 // buy
								if( ema1 > 30.2377 )
									ret := -0.136364
							if( ema3 > 30.2327 )
								if( ema2 <= 30.2865 )
									ret := -0.809524 // sell
								if( ema2 > 30.2865 )
									ret := -0.057889
	if( ema12 > 0.053585 )
		if( ema2 <= 15.6066 )
			if( ema2 <= 14.2057 )
				if( ema2 <= 13.5495 )
					if( ema2 <= 10.9493 )
						if( ema2 <= 10.8771 )
							ret := 0.333333
						if( ema2 > 10.8771 )
							ret := -1.000000 // sell
					if( ema2 > 10.9493 )
						if( tema <= 13.2725 )
							if( ema1 <= 12.168 )
								if( ema2 <= 11.4447 )
									ret := 0.610390
								if( ema2 > 11.4447 )
									ret := -0.294118
							if( ema1 > 12.168 )
								if( ema1 <= 12.6734 )
									ret := 0.913043 // buy
								if( ema1 > 12.6734 )
									ret := 0.555556
						if( tema > 13.2725 )
							if( ema12 <= 0.06977 )
								ret := 0.722222 // buy
							if( ema12 > 0.06977 )
								if( ema12 <= 0.132231 )
									ret := -0.800000 // sell
								if( ema12 > 0.132231 )
									ret := -1.000000 // sell
				if( ema2 > 13.5495 )
					if( ema2 <= 13.7117 )
						ret := -1.000000 // sell
					if( ema2 > 13.7117 )
						if( ema3 <= 14.0147 )
							if( ema2 <= 13.9615 )
								ret := 0.062500
							if( ema2 > 13.9615 )
								ret := 0.700000 // buy
						if( ema3 > 14.0147 )
							ret := -1.000000 // sell
			if( ema2 > 14.2057 )
				if( ema1 <= 14.3656 )
					ret := 1.000000 // buy
				if( ema1 > 14.3656 )
					if( ema2 <= 14.7568 )
						if( ema3 <= 14.4433 )
							if( ema12 <= 0.093533 )
								ret := -0.285714
							if( ema12 > 0.093533 )
								if( ema13 <= 0.228387 )
									ret := 1.000000 // buy
								if( ema13 > 0.228387 )
									ret := 0.833333 // buy
						if( ema3 > 14.4433 )
							if( ema13 <= 0.224011 )
								ret := 0.000000
							if( ema13 > 0.224011 )
								ret := -0.928571 // sell
					if( ema2 > 14.7568 )
						if( ema3 <= 15.4229 )
							if( ema12 <= 0.208446 )
								if( ema12 <= 0.070753 )
									ret := 0.391304
								if( ema12 > 0.070753 )
									ret := 0.898990 // buy
							if( ema12 > 0.208446 )
								ret := -0.125000
						if( ema3 > 15.4229 )
							if( ema13 <= 0.16141 )
								ret := 0.285714
							if( ema13 > 0.16141 )
								ret := -0.416667
		if( ema2 > 15.6066 )
			if( ema1 <= 33.9463 )
				if( ema12 <= 0.270347 )
					if( ema2 <= 28.5673 )
						if( ema3 <= 24.9774 )
							if( ema1 <= 25.0999 )
								if( ema3 <= 24.8325 )
									ret := -0.102075
								if( ema3 > 24.8325 )
									ret := -0.471545
							if( ema1 > 25.0999 )
								if( ema13 <= 0.440752 )
									ret := 0.838710 // buy
								if( ema13 > 0.440752 )
									ret := -0.636364
						if( ema3 > 24.9774 )
							if( ema1 <= 26.5175 )
								if( ema12 <= 0.101738 )
									ret := -0.518667
								if( ema12 > 0.101738 )
									ret := -0.093596
							if( ema1 > 26.5175 )
								if( tema <= 26.8986 )
									ret := 0.538961
								if( tema > 26.8986 )
									ret := -0.172461
					if( ema2 > 28.5673 )
						if( ema2 <= 33.083 )
							if( ema3 <= 32.649 )
								if( tema <= 31.2227 )
									ret := 0.040102
								if( tema > 31.2227 )
									ret := -0.173193
							if( ema3 > 32.649 )
								if( ema2 <= 32.673 )
									ret := -0.250000
								if( ema2 > 32.673 )
									ret := 0.918367 // buy
						if( ema2 > 33.083 )
							if( ema12 <= 0.130864 )
								if( ema2 <= 33.3103 )
									ret := -0.961538 // sell
								if( ema2 > 33.3103 )
									ret := 0.478632
							if( ema12 > 0.130864 )
								if( tema <= 34.1065 )
									ret := -0.745223 // sell
								if( tema > 34.1065 )
									ret := 0.400000
				if( ema12 > 0.270347 )
					if( tema <= 32.0326 )
						if( ema3 <= 30.3277 )
							if( tema <= 29.9107 )
								if( ema2 <= 28.4878 )
									ret := -0.292683
								if( ema2 > 28.4878 )
									ret := 0.342466
							if( tema > 29.9107 )
								if( ema1 <= 29.3122 )
									ret := 0.307692
								if( ema1 > 29.3122 )
									ret := -0.655063
						if( ema3 > 30.3277 )
							if( ema13 <= 0.514799 )
								ret := -0.333333
							if( ema13 > 0.514799 )
								if( ema13 <= 0.601073 )
									ret := 0.714286 // buy
								if( ema13 > 0.601073 )
									ret := 0.000000
					if( tema > 32.0326 )
						if( ema2 <= 28.4905 )
							ret := -0.066667
						if( ema2 > 28.4905 )
							if( ema13 <= 0.540188 )
								if( ema1 <= 33.4664 )
									ret := -0.057143
								if( ema1 > 33.4664 )
									ret := -1.000000 // sell
							if( ema13 > 0.540188 )
								if( ema3 <= 32.6675 )
									ret := -0.937063 // sell
								if( ema3 > 32.6675 )
									ret := -0.714286 // sell
			if( ema1 > 33.9463 )
				if( ema1 <= 36.3634 )
					if( ema1 <= 36.0323 )
						if( tema <= 35.8022 )
							if( ema3 <= 34.6068 )
								if( ema12 <= 0.30263 )
									ret := 0.456522
								if( ema12 > 0.30263 )
									ret := -0.076923
							if( ema3 > 34.6068 )
								if( ema2 <= 34.8675 )
									ret := 0.888889 // buy
								if( ema2 > 34.8675 )
									ret := 1.000000 // buy
						if( tema > 35.8022 )
							if( ema12 <= 0.563908 )
								if( ema13 <= 0.247124 )
									ret := -0.967742 // sell
								if( ema13 > 0.247124 )
									ret := 0.716418 // buy
							if( ema12 > 0.563908 )
								ret := -1.000000 // sell
					if( ema1 > 36.0323 )
						if( ema2 <= 35.9183 )
							if( ema3 <= 35.1915 )
								ret := 1.000000 // buy
							if( ema3 > 35.1915 )
								if( tema <= 36.8176 )
									ret := 0.933333 // buy
								if( tema > 36.8176 )
									ret := -0.200000
						if( ema2 > 35.9183 )
							ret := 1.000000 // buy
				if( ema1 > 36.3634 )
					if( ema13 <= 2.42693 )
						if( ema2 <= 37.7841 )
							if( ema1 <= 37.6125 )
								if( ema12 <= 0.477682 )
									ret := -0.040000
								if( ema12 > 0.477682 )
									ret := -0.716667 // sell
							if( ema1 > 37.6125 )
								if( ema1 <= 37.6819 )
									ret := -0.600000
								if( ema1 > 37.6819 )
									ret := -0.971831 // sell
						if( ema2 > 37.7841 )
							if( ema3 <= 38.756 )
								if( ema2 <= 37.926 )
									ret := 0.176471
								if( ema2 > 37.926 )
									ret := 0.972222 // buy
							if( ema3 > 38.756 )
								if( ema13 <= 0.787472 )
									ret := -0.111801
								if( ema13 > 0.787472 )
									ret := 0.131133
					if( ema13 > 2.42693 )
						if( ema2 <= 39.1555 )
							ret := 1.000000 // buy
						if( ema2 > 39.1555 )
							if( tema <= 56.6708 )
								if( ema3 <= 50.4169 )
									ret := -0.978947 // sell
								if( ema3 > 50.4169 )
									ret := -0.777778 // sell
							if( tema > 56.6708 )
								if( tema <= 73.5183 )
									ret := -0.178295
								if( tema > 73.5183 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_GME_1Min_1d6427aa(ema12, ema3, ema13, tema, ema1, ema2)

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


