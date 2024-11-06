//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AAVEUSDT_30Min_1T00_9f006bb8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_1T00_9f006bb8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_9f006bb8(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 405.322 )
		if( ema12 <= -0.747563 )
			if( tema <= 104.999 )
				if( ema2 <= 104.757 )
					if( ema13 <= -5.15069 )
						if( tema <= 81.3578 )
							if( ema3 <= 89.831 )
								if( ema13 <= -6.1095 )
									ret := 0.000000
								if( ema13 > -6.1095 )
									ret := -0.375000
							if( ema3 > 89.831 )
								ret := 1.000000 // buy
						if( tema > 81.3578 )
							if( ema2 <= 100.676 )
								if( ema13 <= -6.92364 )
									ret := -0.960000 // sell
								if( ema13 > -6.92364 )
									ret := -1.000000 // sell
							if( ema2 > 100.676 )
								ret := -0.250000
					if( ema13 > -5.15069 )
						if( ema3 <= 87.7026 )
							if( ema3 <= 75.0418 )
								if( ema1 <= 60.8001 )
									ret := 0.416446
								if( ema1 > 60.8001 )
									ret := 0.040609
							if( ema3 > 75.0418 )
								if( ema1 <= 81.8484 )
									ret := 0.487765
								if( ema1 > 81.8484 )
									ret := 0.279302
						if( ema3 > 87.7026 )
							if( ema1 <= 86.3422 )
								if( ema12 <= -1.55669 )
									ret := 0.280000
								if( ema12 > -1.55669 )
									ret := -0.711538 // sell
							if( ema1 > 86.3422 )
								if( tema <= 85.9468 )
									ret := 0.549296
								if( tema > 85.9468 )
									ret := 0.148112
				if( ema2 > 104.757 )
					if( ema1 <= 107.744 )
						if( ema12 <= -2.90898 )
							if( tema <= 98.3577 )
								ret := 0.400000
							if( tema > 98.3577 )
								if( ema13 <= -4.58772 )
									ret := 0.954545 // buy
								if( ema13 > -4.58772 )
									ret := 0.600000
						if( ema12 > -2.90898 )
							if( tema <= 104.509 )
								if( ema12 <= -1.57761 )
									ret := 0.387755
								if( ema12 > -1.57761 )
									ret := 0.769231 // buy
							if( tema > 104.509 )
								if( ema13 <= -3.11521 )
									ret := -0.777778 // sell
								if( ema13 > -3.11521 )
									ret := 0.400000
					if( ema1 > 107.744 )
						if( ema2 <= 112.167 )
							if( tema <= 104.315 )
								ret := -1.000000 // sell
							if( tema > 104.315 )
								ret := -0.250000
						if( ema2 > 112.167 )
							ret := 0.250000
			if( tema > 104.999 )
				if( ema1 <= 107.344 )
					if( ema13 <= -2.47256 )
						if( ema12 <= -1.0963 )
							ret := -1.000000 // sell
						if( ema12 > -1.0963 )
							if( ema12 <= -0.987225 )
								ret := -0.500000
							if( ema12 > -0.987225 )
								if( ema13 <= -2.86219 )
									ret := -1.000000 // sell
								if( ema13 > -2.86219 )
									ret := -0.750000 // sell
					if( ema13 > -2.47256 )
						if( ema1 <= 106.536 )
							if( ema1 <= 106.483 )
								ret := 0.333333
							if( ema1 > 106.483 )
								ret := 0.750000 // buy
						if( ema1 > 106.536 )
							if( tema <= 105.578 )
								if( ema1 <= 106.924 )
									ret := -0.750000 // sell
								if( ema1 > 106.924 )
									ret := -1.000000 // sell
							if( tema > 105.578 )
								ret := 0.000000
				if( ema1 > 107.344 )
					if( ema13 <= -10.4037 )
						if( tema <= 228.612 )
							if( ema3 <= 210.214 )
								if( ema1 <= 192.956 )
									ret := 0.520000
								if( ema1 > 192.956 )
									ret := -1.000000 // sell
							if( ema3 > 210.214 )
								if( ema1 <= 232.441 )
									ret := 1.000000 // buy
								if( ema1 > 232.441 )
									ret := 0.894737 // buy
						if( tema > 228.612 )
							if( ema1 <= 247.71 )
								if( tema <= 230.643 )
									ret := 0.166667
								if( tema > 230.643 )
									ret := -0.962963 // sell
							if( ema1 > 247.71 )
								if( ema1 <= 412.61 )
									ret := 0.224138
								if( ema1 > 412.61 )
									ret := -1.000000 // sell
					if( ema13 > -10.4037 )
						if( ema13 <= -0.535291 )
							if( ema2 <= 111.296 )
								if( ema1 <= 108.756 )
									ret := -0.173077
								if( ema1 > 108.756 )
									ret := 0.653846
							if( ema2 > 111.296 )
								if( ema1 <= 114.962 )
									ret := -0.200000
								if( ema1 > 114.962 )
									ret := 0.048298
						if( ema13 > -0.535291 )
							if( tema <= 384.225 )
								if( ema1 <= 373.046 )
									ret := -0.272727
								if( ema1 > 373.046 )
									ret := 0.375000
							if( tema > 384.225 )
								if( ema1 <= 397.529 )
									ret := -0.833333 // sell
								if( ema1 > 397.529 )
									ret := -0.533333
		if( ema12 > -0.747563 )
			if( ema12 <= 7.07324 )
				if( ema2 <= 27.3349 )
					if( ema1 <= 27.3416 )
						if( tema <= 26.0184 )
							ret := 0.500000
						if( tema > 26.0184 )
							if( tema <= 26.2494 )
								ret := 0.833333 // buy
							if( tema > 26.2494 )
								ret := 1.000000 // buy
					if( ema1 > 27.3416 )
						ret := 0.400000
				if( ema2 > 27.3349 )
					if( ema3 <= 387.323 )
						if( ema2 <= 366.918 )
							if( ema2 <= 353.726 )
								if( ema3 <= 336.472 )
									ret := 0.043521
								if( ema3 > 336.472 )
									ret := -0.225326
							if( ema2 > 353.726 )
								if( ema13 <= 0.724257 )
									ret := 0.040984
								if( ema13 > 0.724257 )
									ret := 0.391499
						if( ema2 > 366.918 )
							if( ema2 <= 371.412 )
								if( ema1 <= 368.879 )
									ret := 0.000000
								if( ema1 > 368.879 )
									ret := -0.448845
							if( ema2 > 371.412 )
								if( ema3 <= 376.549 )
									ret := 0.189899
								if( ema3 > 376.549 )
									ret := -0.137741
					if( ema3 > 387.323 )
						if( ema3 <= 400.092 )
							if( ema13 <= 3.53145 )
								if( ema13 <= 0.370574 )
									ret := 0.542373
								if( ema13 > 0.370574 )
									ret := 0.032258
							if( ema13 > 3.53145 )
								if( ema3 <= 396.376 )
									ret := 0.711268 // buy
								if( ema3 > 396.376 )
									ret := 0.133333
						if( ema3 > 400.092 )
							if( ema1 <= 400.714 )
								ret := -1.000000 // sell
							if( ema1 > 400.714 )
								if( ema13 <= -0.626705 )
									ret := 0.562500
								if( ema13 > -0.626705 )
									ret := -0.392157
			if( ema12 > 7.07324 )
				if( ema1 <= 364.986 )
					if( ema3 <= 178.553 )
						if( ema13 <= 12.5698 )
							ret := -1.000000 // sell
						if( ema13 > 12.5698 )
							ret := -0.750000 // sell
					if( ema3 > 178.553 )
						if( ema3 <= 316.119 )
							if( ema1 <= 317.123 )
								if( ema13 <= 13.6752 )
									ret := 0.720000 // buy
								if( ema13 > 13.6752 )
									ret := 0.325843
							if( ema1 > 317.123 )
								if( ema12 <= 8.45984 )
									ret := 0.222222
								if( ema12 > 8.45984 )
									ret := -0.555556
						if( ema3 > 316.119 )
							if( ema13 <= 21.2444 )
								if( tema <= 365.926 )
									ret := 0.708861 // buy
								if( tema > 365.926 )
									ret := 1.000000 // buy
							if( ema13 > 21.2444 )
								if( tema <= 370.517 )
									ret := -0.166667
								if( tema > 370.517 )
									ret := 0.600000
				if( ema1 > 364.986 )
					if( ema13 <= 21.4114 )
						if( ema1 <= 395.109 )
							if( ema12 <= 8.72179 )
								if( ema13 <= 15.1315 )
									ret := -0.480000
								if( ema13 > 15.1315 )
									ret := 0.333333
							if( ema12 > 8.72179 )
								if( ema1 <= 385.212 )
									ret := 0.315789
								if( ema1 > 385.212 )
									ret := 0.800000 // buy
						if( ema1 > 395.109 )
							ret := 1.000000 // buy
					if( ema13 > 21.4114 )
						if( ema3 <= 358.035 )
							if( ema12 <= 15.4708 )
								if( ema12 <= 14.0065 )
									ret := -0.882353 // sell
								if( ema12 > 14.0065 )
									ret := -0.500000
							if( ema12 > 15.4708 )
								ret := -1.000000 // sell
						if( ema3 > 358.035 )
							ret := 0.166667
	if( tema > 405.322 )
		if( ema2 <= 410.122 )
			if( ema13 <= 2.71977 )
				if( tema <= 410.131 )
					if( ema13 <= 1.23671 )
						if( ema3 <= 405.005 )
							if( ema13 <= -0.748515 )
								ret := -0.200000
							if( ema13 > -0.748515 )
								if( ema12 <= 1.09357 )
									ret := -0.941176 // sell
								if( ema12 > 1.09357 )
									ret := -0.600000
						if( ema3 > 405.005 )
							if( ema2 <= 409.452 )
								if( ema2 <= 408.778 )
									ret := -0.222222
								if( ema2 > 408.778 )
									ret := -0.894737 // sell
							if( ema2 > 409.452 )
								if( ema2 <= 409.719 )
									ret := 0.000000
								if( ema2 > 409.719 )
									ret := 0.250000
					if( ema13 > 1.23671 )
						if( tema <= 409.441 )
							if( tema <= 408.013 )
								if( ema1 <= 403.736 )
									ret := -0.500000
								if( ema1 > 403.736 )
									ret := 0.000000
							if( tema > 408.013 )
								ret := 0.500000
						if( tema > 409.441 )
							ret := -0.750000 // sell
				if( tema > 410.131 )
					if( tema <= 411.184 )
						if( ema3 <= 409.221 )
							if( ema12 <= 1.05128 )
								ret := -1.000000 // sell
							if( ema12 > 1.05128 )
								ret := -0.857143 // sell
						if( ema3 > 409.221 )
							ret := -0.750000 // sell
					if( tema > 411.184 )
						if( ema1 <= 410.846 )
							if( ema3 <= 408.249 )
								ret := 0.000000
							if( ema3 > 408.249 )
								ret := -0.250000
						if( ema1 > 410.846 )
							ret := -0.833333 // sell
			if( ema13 > 2.71977 )
				if( ema13 <= 6.74644 )
					if( ema2 <= 404.178 )
						if( ema3 <= 401.516 )
							if( tema <= 412.462 )
								if( ema12 <= 4.10276 )
									ret := -0.396226
								if( ema12 > 4.10276 )
									ret := 1.000000 // buy
							if( tema > 412.462 )
								ret := 0.800000 // buy
						if( ema3 > 401.516 )
							ret := -1.000000 // sell
					if( ema2 > 404.178 )
						if( ema1 <= 408.128 )
							if( tema <= 410.454 )
								if( ema13 <= 4.29925 )
									ret := 0.928571 // buy
								if( ema13 > 4.29925 )
									ret := 0.000000
							if( tema > 410.454 )
								if( ema13 <= 3.32963 )
									ret := -1.000000 // sell
								if( ema13 > 3.32963 )
									ret := 0.750000 // buy
						if( ema1 > 408.128 )
							if( ema1 <= 410.628 )
								if( ema1 <= 410.282 )
									ret := -0.285714
								if( ema1 > 410.282 )
									ret := -1.000000 // sell
							if( ema1 > 410.628 )
								if( ema3 <= 407.23 )
									ret := 0.555556
								if( ema3 > 407.23 )
									ret := -0.800000 // sell
				if( ema13 > 6.74644 )
					if( ema13 <= 15.0401 )
						if( ema12 <= 4.30765 )
							if( ema13 <= 6.91619 )
								ret := -0.500000
							if( ema13 > 6.91619 )
								if( ema1 <= 404.224 )
									ret := 0.250000
								if( ema1 > 404.224 )
									ret := 0.000000
						if( ema12 > 4.30765 )
							if( ema2 <= 395.504 )
								if( ema12 <= 6.48082 )
									ret := 0.666667
								if( ema12 > 6.48082 )
									ret := -0.857143 // sell
							if( ema2 > 395.504 )
								if( tema <= 422.023 )
									ret := -0.775281 // sell
								if( tema > 422.023 )
									ret := -0.200000
					if( ema13 > 15.0401 )
						if( ema13 <= 25.8152 )
							if( ema1 <= 406.687 )
								if( ema13 <= 17.0784 )
									ret := 0.750000 // buy
								if( ema13 > 17.0784 )
									ret := 1.000000 // buy
							if( ema1 > 406.687 )
								if( ema13 <= 18.3346 )
									ret := 0.000000
								if( ema13 > 18.3346 )
									ret := -0.600000
						if( ema13 > 25.8152 )
							if( ema1 <= 392.902 )
								ret := -1.000000 // sell
							if( ema1 > 392.902 )
								ret := -0.666667
		if( ema2 > 410.122 )
			if( ema12 <= -5.29655 )
				if( ema1 <= 428.142 )
					if( ema1 <= 418.689 )
						if( ema3 <= 426.365 )
							ret := 1.000000 // buy
						if( ema3 > 426.365 )
							ret := 0.000000
					if( ema1 > 418.689 )
						if( ema3 <= 439.728 )
							ret := -1.000000 // sell
						if( ema3 > 439.728 )
							ret := -0.333333
				if( ema1 > 428.142 )
					if( ema1 <= 506.13 )
						if( ema13 <= -24.2989 )
							if( ema2 <= 514.175 )
								if( ema3 <= 473.246 )
									ret := 0.200000
								if( ema3 > 473.246 )
									ret := -0.785714 // sell
							if( ema2 > 514.175 )
								if( tema <= 467.772 )
									ret := 0.833333 // buy
								if( tema > 467.772 )
									ret := 1.000000 // buy
						if( ema13 > -24.2989 )
							if( ema12 <= -6.32298 )
								if( ema2 <= 459.806 )
									ret := 0.396226
								if( ema2 > 459.806 )
									ret := 0.734513 // buy
							if( ema12 > -6.32298 )
								if( ema2 <= 444.377 )
									ret := 0.774194 // buy
								if( ema2 > 444.377 )
									ret := 0.114286
					if( ema1 > 506.13 )
						if( ema12 <= -11.8315 )
							if( ema3 <= 550.468 )
								ret := 0.428571
							if( ema3 > 550.468 )
								if( tema <= 560.663 )
									ret := 0.952381 // buy
								if( tema > 560.663 )
									ret := 0.333333
						if( ema12 > -11.8315 )
							if( ema3 <= 545.315 )
								if( ema12 <= -6.6853 )
									ret := -0.777778 // sell
								if( ema12 > -6.6853 )
									ret := 0.000000
							if( ema3 > 545.315 )
								if( ema3 <= 557.484 )
									ret := 0.782609 // buy
								if( ema3 > 557.484 )
									ret := -0.215385
			if( ema12 > -5.29655 )
				if( ema3 <= 537.376 )
					if( ema12 <= 2.12758 )
						if( ema1 <= 480.138 )
							if( ema3 <= 464.811 )
								if( ema3 <= 433.6 )
									ret := -0.198807
								if( ema3 > 433.6 )
									ret := 0.044678
							if( ema3 > 464.811 )
								if( tema <= 458.833 )
									ret := 0.023810
								if( tema > 458.833 )
									ret := -0.620833
						if( ema1 > 480.138 )
							if( ema1 <= 485.679 )
								if( ema13 <= 0.986486 )
									ret := 0.906667 // buy
								if( ema13 > 0.986486 )
									ret := -0.714286 // sell
							if( ema1 > 485.679 )
								if( ema2 <= 513.982 )
									ret := -0.250923
								if( ema2 > 513.982 )
									ret := 0.162162
					if( ema12 > 2.12758 )
						if( ema1 <= 433.91 )
							if( ema2 <= 417.049 )
								if( ema1 <= 416.182 )
									ret := 0.666667
								if( ema1 > 416.182 )
									ret := -0.250000
							if( ema2 > 417.049 )
								if( ema13 <= 12.0469 )
									ret := 0.808511 // buy
								if( ema13 > 12.0469 )
									ret := 0.166667
						if( ema1 > 433.91 )
							if( ema3 <= 429.74 )
								if( ema13 <= 12.239 )
									ret := -0.277778
								if( ema13 > 12.239 )
									ret := -0.870968 // sell
							if( ema3 > 429.74 )
								if( ema13 <= 19.5045 )
									ret := 0.111675
								if( ema13 > 19.5045 )
									ret := -0.401515
				if( ema3 > 537.376 )
					if( ema12 <= 8.99745 )
						if( ema2 <= 560.353 )
							if( ema3 <= 550.279 )
								if( ema1 <= 535.978 )
									ret := 0.375000
								if( ema1 > 535.978 )
									ret := -0.800000 // sell
							if( ema3 > 550.279 )
								if( ema13 <= 10.0277 )
									ret := 0.947368 // buy
								if( ema13 > 10.0277 )
									ret := 0.500000
						if( ema2 > 560.353 )
							if( ema2 <= 592.572 )
								if( ema1 <= 561.534 )
									ret := -0.750000 // sell
								if( ema1 > 561.534 )
									ret := -1.000000 // sell
							if( ema2 > 592.572 )
								if( ema2 <= 637.084 )
									ret := -0.150000
								if( ema2 > 637.084 )
									ret := -0.825000 // sell
					if( ema12 > 8.99745 )
						if( ema13 <= 21.6481 )
							if( ema13 <= 13.7535 )
								ret := -1.000000 // sell
							if( ema13 > 13.7535 )
								if( ema12 <= 12.8697 )
									ret := 1.000000 // buy
								if( ema12 > 12.8697 )
									ret := 0.750000 // buy
						if( ema13 > 21.6481 )
							if( tema <= 613.45 )
								if( ema3 <= 567.727 )
									ret := 0.000000
								if( ema3 > 567.727 )
									ret := -1.000000 // sell
							if( tema > 613.45 )
								if( ema12 <= 16.0828 )
									ret := 0.826087 // buy
								if( ema12 > 16.0828 )
									ret := -0.636364
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_9f006bb8(ema3, tema, ema2, ema12, ema13, ema1)

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


