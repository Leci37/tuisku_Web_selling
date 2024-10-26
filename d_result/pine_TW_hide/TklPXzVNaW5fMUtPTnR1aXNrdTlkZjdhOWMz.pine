//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: NIO_5Min_1KON_9df7a9c3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_1KON_9df7a9c3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_9df7a9c3(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( verde_mean <= 64.8035 )
		if( xrsi <= 11.9523 )
			if( pvim <= -0.361643 )
				if( marron <= -6.76989 )
					if( verde <= -125.223 )
						if( source <= 5.20143 )
							ret := 0.857143 // buy
						if( source > 5.20143 )
							if( xmf <= 10.5691 )
								ret := -0.714286 // sell
							if( xmf > 10.5691 )
								ret := 0.545455
					if( verde > -125.223 )
						if( verde_azul <= 27.0288 )
							if( marron_mean <= -15.0408 )
								if( nvimin <= 0.241794 )
									ret := -0.760000 // sell
								if( nvimin > 0.241794 )
									ret := -0.955056 // sell
							if( marron_mean > -15.0408 )
								if( media_azul <= 11.9729 )
									ret := -0.833333 // sell
								if( media_azul > 11.9729 )
									ret := -0.062500
						if( verde_azul > 27.0288 )
							if( tprice <= 4.83849 )
								ret := -0.777778 // sell
							if( tprice > 4.83849 )
								ret := -0.062500
				if( marron > -6.76989 )
					if( pvimin <= -0.476416 )
						if( azul <= -17.2225 )
							if( nvi_ema <= 0.331849 )
								ret := 0.647059
							if( nvi_ema > 0.331849 )
								ret := 0.133333
						if( azul > -17.2225 )
							ret := -0.714286 // sell
					if( pvimin > -0.476416 )
						if( verde_media <= -18.7279 )
							if( pvi <= -0.402849 )
								ret := -0.200000
							if( pvi > -0.402849 )
								ret := -1.000000 // sell
						if( verde_media > -18.7279 )
							ret := -1.000000 // sell
			if( pvim > -0.361643 )
				if( marron <= -32.095 )
					if( verde <= -164.765 )
						if( pvi <= 0.044298 )
							ret := -1.000000 // sell
						if( pvi > 0.044298 )
							ret := -0.777778 // sell
					if( verde > -164.765 )
						if( pvimax <= 0.066384 )
							ret := -0.090909
						if( pvimax > 0.066384 )
							ret := -0.461538
				if( marron > -32.095 )
					if( stoc <= 4.32116 )
						if( media <= -5.52073 )
							ret := 0.304348
						if( media > -5.52073 )
							if( media_azul <= 13.7303 )
								ret := 1.000000 // buy
							if( media_azul > 13.7303 )
								ret := 0.727273 // buy
					if( stoc > 4.32116 )
						if( verde_media <= -148.122 )
							if( media_azul <= 32.9025 )
								ret := 0.222222
							if( media_azul > 32.9025 )
								if( media_azul <= 92.0151 )
									ret := 1.000000 // buy
								if( media_azul > 92.0151 )
									ret := 0.777778 // buy
						if( verde_media > -148.122 )
							if( tprice <= 14.3148 )
								if( verde_media <= -18.9541 )
									ret := -0.151079
								if( verde_media > -18.9541 )
									ret := -0.923077 // sell
							if( tprice > 14.3148 )
								ret := 1.000000 // buy
		if( xrsi > 11.9523 )
			if( verde_media <= -26.8663 )
				if( source <= 7.11934 )
					if( verde <= -34.5483 )
						if( pvimax <= -0.49123 )
							if( nvimin <= 0.202496 )
								if( azul_mean <= 25.8354 )
									ret := 0.629630
								if( azul_mean > 25.8354 )
									ret := -0.450000
							if( nvimin > 0.202496 )
								if( media_azul <= 34.1409 )
									ret := -0.251445
								if( media_azul > 34.1409 )
									ret := 0.194570
						if( pvimax > -0.49123 )
							if( stoc <= 39.1158 )
								if( nvi <= 0.095315 )
									ret := 0.732283 // buy
								if( nvi > 0.095315 )
									ret := 0.348792
							if( stoc > 39.1158 )
								if( verde_media <= -229.044 )
									ret := -0.911111 // sell
								if( verde_media > -229.044 )
									ret := -0.018382
					if( verde > -34.5483 )
						if( azul <= -41.4818 )
							if( marron_mean <= 4.09672 )
								if( pvi <= -0.289152 )
									ret := 0.922078 // buy
								if( pvi > -0.289152 )
									ret := 0.619048
							if( marron_mean > 4.09672 )
								if( nvimin <= 0.378313 )
									ret := 0.209091
								if( nvimin > 0.378313 )
									ret := 0.740000 // buy
						if( azul > -41.4818 )
							if( xrsi <= 47.8497 )
								if( media_azul <= 16.9095 )
									ret := -0.101299
								if( media_azul > 16.9095 )
									ret := 0.127710
							if( xrsi > 47.8497 )
								if( verde_azul <= -12.4875 )
									ret := 0.258741
								if( verde_azul > -12.4875 )
									ret := -0.186370
				if( source > 7.11934 )
					if( marron <= -15.1713 )
						if( pvi <= -0.214624 )
							ret := -0.500000
						if( pvi > -0.214624 )
							if( verde_mean <= -88.4447 )
								if( nvimin <= -0.022254 )
									ret := -0.923077 // sell
								if( nvimin > -0.022254 )
									ret := -0.368421
							if( verde_mean > -88.4447 )
								if( verde_mean <= 12.0148 )
									ret := 0.463357
								if( verde_mean > 12.0148 )
									ret := -0.015385
					if( marron > -15.1713 )
						if( verde <= 4.54838 )
							if( media_azul <= -12.0924 )
								if( marron <= 49.09 )
									ret := -0.398633
								if( marron > 49.09 )
									ret := 0.833333 // buy
							if( media_azul > -12.0924 )
								if( stoc <= 33.281 )
									ret := -0.008819
								if( stoc > 33.281 )
									ret := -0.237576
						if( verde > 4.54838 )
							if( verde_mean <= 60.8379 )
								if( marron_mean <= 35.5836 )
									ret := 0.269171
								if( marron_mean > 35.5836 )
									ret := 0.050510
							if( verde_mean > 60.8379 )
								if( oscp <= -2.79862 )
									ret := 0.318471
								if( oscp > -2.79862 )
									ret := 0.779412 // buy
			if( verde_media > -26.8663 )
				if( oscp <= 24.6464 )
					if( source <= 5.76018 )
						if( source <= 4.09847 )
							if( verde_azul <= 73.3511 )
								if( stoc <= 64.434 )
									ret := -0.171302
								if( stoc > 64.434 )
									ret := 0.293578
							if( verde_azul > 73.3511 )
								if( source <= 3.73432 )
									ret := 0.800000 // buy
								if( source > 3.73432 )
									ret := 0.188889
						if( source > 4.09847 )
							if( azul <= 3.50285 )
								if( verde_mean <= -23.3228 )
									ret := -0.378151
								if( verde_mean > -23.3228 )
									ret := 0.145414
							if( azul > 3.50285 )
								if( azul <= 46.7891 )
									ret := -0.024728
								if( azul > 46.7891 )
									ret := 0.307159
					if( source > 5.76018 )
						if( verde <= 47.614 )
							if( xmf <= 38.6214 )
								if( stoc <= 22.8922 )
									ret := -0.078265
								if( stoc > 22.8922 )
									ret := 0.083825
							if( xmf > 38.6214 )
								if( oscp <= 6.91479 )
									ret := -0.115370
								if( oscp > 6.91479 )
									ret := -0.544643
						if( verde > 47.614 )
							if( marron <= 53.4638 )
								if( nvimax <= 0.282623 )
									ret := -0.046137
								if( nvimax > 0.282623 )
									ret := -0.340824
							if( marron > 53.4638 )
								if( verde_media <= 16.2673 )
									ret := 0.177969
								if( verde_media > 16.2673 )
									ret := 0.001011
				if( oscp > 24.6464 )
					if( azul_mean <= 53.1742 )
						if( azul <= -83.4659 )
							if( pvimin <= -0.147993 )
								ret := 0.333333
							if( pvimin > -0.147993 )
								ret := 1.000000 // buy
						if( azul > -83.4659 )
							if( oscp <= 81.5456 )
								if( azul <= 10.9087 )
									ret := -0.330494
								if( azul > 10.9087 )
									ret := -0.750000 // sell
							if( oscp > 81.5456 )
								if( marron_mean <= 33.4273 )
									ret := 0.652174
								if( marron_mean > 33.4273 )
									ret := -0.266667
					if( azul_mean > 53.1742 )
						ret := 0.687500
	if( verde_mean > 64.8035 )
		if( pvim <= 0.544082 )
			if( tprice <= 3.99798 )
				if( nvi <= 0.210002 )
					if( BollOsc <= 31.3867 )
						if( verde <= 103.371 )
							ret := -0.235294
						if( verde > 103.371 )
							ret := 0.333333
					if( BollOsc > 31.3867 )
						if( nvi <= 0.208097 )
							if( verde_media <= 58.4539 )
								ret := 1.000000 // buy
							if( verde_media > 58.4539 )
								ret := 0.818182 // buy
						if( nvi > 0.208097 )
							ret := 0.666667
				if( nvi > 0.210002 )
					if( media <= 104.226 )
						if( pvim <= -0.757327 )
							if( nvi <= 0.325404 )
								if( verde_mean <= 68.913 )
									ret := -0.358491
								if( verde_mean > 68.913 )
									ret := 0.047059
							if( nvi > 0.325404 )
								ret := -0.800000 // sell
						if( pvim > -0.757327 )
							if( nvimax <= 0.297973 )
								if( tprice <= 3.89504 )
									ret := 0.541667
								if( tprice > 3.89504 )
									ret := 0.166667
							if( nvimax > 0.297973 )
								if( verde_media <= -36.3706 )
									ret := 0.923077 // buy
								if( verde_media > -36.3706 )
									ret := 0.012618
					if( media > 104.226 )
						if( xrsi <= 69.8516 )
							ret := -0.071429
						if( xrsi > 69.8516 )
							if( nvim <= 0.293204 )
								ret := -0.571429
							if( nvim > 0.293204 )
								ret := -0.933333 // sell
			if( tprice > 3.99798 )
				if( BollOsc <= 88.5261 )
					if( marron_mean <= 139.249 )
						if( BollOsc <= 48.117 )
							if( media_azul <= 49.9273 )
								if( verde_media <= 78.1632 )
									ret := -0.116697
								if( verde_media > 78.1632 )
									ret := -0.661972
							if( media_azul > 49.9273 )
								if( oscp <= -19.5204 )
									ret := 0.242222
								if( oscp > -19.5204 )
									ret := -0.012709
						if( BollOsc > 48.117 )
							if( verde <= 175.649 )
								if( media <= 117.056 )
									ret := -0.146872
								if( media > 117.056 )
									ret := 0.447761
							if( verde > 175.649 )
								if( media_azul <= 53.3663 )
									ret := -0.257764
								if( media_azul > 53.3663 )
									ret := 0.084399
					if( marron_mean > 139.249 )
						if( verde <= 237.912 )
							if( azul <= 150.314 )
								if( verde_azul <= 204.168 )
									ret := -0.800000 // sell
								if( verde_azul > 204.168 )
									ret := -0.360000
							if( azul > 150.314 )
								ret := 0.500000
						if( verde > 237.912 )
							if( verde_azul <= 265.963 )
								ret := -0.200000
							if( verde_azul > 265.963 )
								ret := 1.000000 // buy
				if( BollOsc > 88.5261 )
					if( tprice <= 10.0729 )
						if( verde_mean <= 116.511 )
							if( stoc <= 61.4321 )
								if( tprice <= 7.23696 )
									ret := 0.642857
								if( tprice > 7.23696 )
									ret := 0.200000
							if( stoc > 61.4321 )
								if( verde <= 154.508 )
									ret := 0.575758
								if( verde > 154.508 )
									ret := 0.904762 // buy
						if( verde_mean > 116.511 )
							if( nvi_ema <= -0.004816 )
								if( pvimax <= 0.118375 )
									ret := 0.400000
								if( pvimax > 0.118375 )
									ret := 0.904762 // buy
							if( nvi_ema > -0.004816 )
								if( media <= 86.1217 )
									ret := 0.512821
								if( media > 86.1217 )
									ret := -0.168831
					if( tprice > 10.0729 )
						if( verde_azul <= 168.067 )
							if( verde <= 170.586 )
								ret := -0.545455
							if( verde > 170.586 )
								ret := -0.900000 // sell
						if( verde_azul > 168.067 )
							if( media_azul <= 85.7768 )
								if( oscp <= 90.8235 )
									ret := 0.500000
								if( oscp > 90.8235 )
									ret := -0.782609 // sell
							if( media_azul > 85.7768 )
								if( media <= 88.9394 )
									ret := 0.818182 // buy
								if( media > 88.9394 )
									ret := 0.142857
		if( pvim > 0.544082 )
			if( pvi <= 0.628632 )
				if( nvimax <= 0.019072 )
					if( marron_mean <= 78.1076 )
						if( pvi <= 0.574469 )
							if( nvi_ema <= -0.013966 )
								ret := -0.043478
							if( nvi_ema > -0.013966 )
								ret := 0.909091 // buy
						if( pvi > 0.574469 )
							if( pvimax <= 0.615822 )
								if( verde_azul <= 80.3522 )
									ret := 0.000000
								if( verde_azul > 80.3522 )
									ret := -0.250000
							if( pvimax > 0.615822 )
								ret := -0.800000 // sell
					if( marron_mean > 78.1076 )
						if( verde_azul <= 132.5 )
							if( media <= 102.629 )
								if( stoc <= 87.1791 )
									ret := 0.629630
								if( stoc > 87.1791 )
									ret := 0.934959 // buy
							if( media > 102.629 )
								if( pvimax <= 0.568574 )
									ret := -0.142857
								if( pvimax > 0.568574 )
									ret := 0.400000
						if( verde_azul > 132.5 )
							if( xmf <= 65.9315 )
								ret := -0.777778 // sell
							if( xmf > 65.9315 )
								ret := -0.105263
				if( nvimax > 0.019072 )
					if( pvi_ema <= 0.573067 )
						if( nvi <= 0.046962 )
							if( media <= 81.1255 )
								ret := 0.466667
							if( media > 81.1255 )
								if( pvimax <= 0.585894 )
									ret := 1.000000 // buy
								if( pvimax > 0.585894 )
									ret := 0.888889 // buy
						if( nvi > 0.046962 )
							ret := -0.307692
					if( pvi_ema > 0.573067 )
						if( marron <= 88.1433 )
							if( verde_azul <= 109.743 )
								if( pvi_ema <= 0.578104 )
									ret := 0.888889 // buy
								if( pvi_ema > 0.578104 )
									ret := -0.212766
							if( verde_azul > 109.743 )
								ret := 0.818182 // buy
						if( marron > 88.1433 )
							if( source <= 14.1154 )
								ret := -0.111111
							if( source > 14.1154 )
								if( pvim <= 0.598636 )
									ret := -0.750000 // sell
								if( pvim > 0.598636 )
									ret := -0.100000
			if( pvi > 0.628632 )
				if( pvim <= 0.669156 )
					if( media_azul <= 54.2417 )
						if( verde_mean <= 69.2226 )
							ret := -0.875000 // sell
						if( verde_mean > 69.2226 )
							if( xrsi <= 63.957 )
								ret := 0.043478
							if( xrsi > 63.957 )
								ret := -0.588235
					if( media_azul > 54.2417 )
						if( stoc <= 84.3609 )
							if( tprice <= 15.7156 )
								if( media <= 58.3569 )
									ret := -0.933333 // sell
								if( media > 58.3569 )
									ret := 0.088000
							if( tprice > 15.7156 )
								ret := -0.666667
						if( stoc > 84.3609 )
							if( xrsi <= 85.8539 )
								if( pvim <= 0.631567 )
									ret := 0.117647
								if( pvim > 0.631567 )
									ret := 0.774194 // buy
							if( xrsi > 85.8539 )
								ret := -0.437500
				if( pvim > 0.669156 )
					if( stoc <= 55.7506 )
						ret := -0.923077 // sell
					if( stoc > 55.7506 )
						if( BollOsc <= 26.6964 )
							if( media_azul <= 77.4942 )
								ret := 0.333333
							if( media_azul > 77.4942 )
								ret := -0.411765
						if( BollOsc > 26.6964 )
							if( pvim <= 0.675791 )
								ret := -0.333333
							if( pvim > 0.675791 )
								ret := -0.736842 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Blai5_Koncorde_v10 
//@version=5
//indicator title="Koncorde v10", shorttitle="Konk_v5", overlay=false)

// Declare variables with explicit types
var float pvi = na
var float nvi = na

tprice = ohlc4
lengthEMA = input.int(255, minval=1)
m = input.int(15)
source = hlc3

// Pececillos
pvi := volume > volume[1] ? nz(pvi[1]) + (close - close[1]) / close[1] : nz(pvi[1])
pvim = ta.ema(pvi, m)
pvimax = ta.highest(pvim, 90)
pvimin = ta.lowest(pvim, 90)
oscp = (pvi - pvim) * 100 / (pvimax - pvimin)

// Tiburones
nvi := volume < volume[1] ? nz(nvi[1]) + (close - close[1]) / close[1] : nz(nvi[1])
nvim = ta.ema(nvi, m)
nvimax = ta.highest(nvim, 90)
nvimin = ta.lowest(nvim, 90)
azul = (nvi - nvim) * 100 / (nvimax - nvimin)

// // Money Flow Index
// Money Flow Index
source_positive = ta.change(source) > 0 ? source : 0
source_negative = ta.change(source) < 0 ? source : 0
upper_s = math.sum(volume * source_positive, 14)
lower_s = math.sum(volume * source_negative, 14)
// Custom Money Flow Index calculation
money_flow_ratio = upper_s / lower_s
xmf = 100 - (100 / (1 + money_flow_ratio))


// Bollinger
mult = input.float(2.0)
basis = ta.sma(tprice, 25)
dev = mult * ta.stdev(tprice, 25)
upper = basis + dev
lower = basis - dev
OB1 = (upper + lower) / 2.0
OB2 = upper - lower
BollOsc = (tprice - OB1) / OB2 * 100

xrsi = ta.rsi(tprice, 14)

// Stochastic Calculation Function
calc_stoch(src, length, smoothFastD) =>
    ll = ta.lowest(low, length)
    hh = ta.highest(high, length)
    k = 100 * (src - ll) / (hh - ll)
    ta.sma(k, smoothFastD)

stoc = calc_stoch(tprice, 21, 3)
marron = (xrsi + xmf + BollOsc + stoc / 3) / 2
verde = marron + oscp
media = ta.ema(marron, m)
bandacero = 0.0

azul_mean = ta.sma(azul, 5)
verde_mean = ta.sma(verde, 5)
marron_mean = ta.sma(marron, 5)
verde_azul = verde - azul
verde_media = verde - media
media_azul = media - azul
media_marron = media - marron
pvi_ema = pvim
nvi_ema = nvi

// PLOT
vl = plot(verde, color=color.new(#66FF66, 0), style=plot.style_area, title="verde")  // GREEN
ml = plot(marron, color=color.new(#FFCC99, 0), style=plot.style_area, title="marron")  // BEIGE
al = plot(azul, color=color.new(#00FFFF, 0), style=plot.style_area, title="azul")  // CYAN
plot(marron, color=color.new(#330000, 0), style=plot.style_line, linewidth=2, title="lmarron")  // DARK RED
plot(verde, color=color.new(#006600, 0), style=plot.style_line, linewidth=2, title="lineav")  // DARK GREEN
plot(azul, color=color.new(#000066, 0), style=plot.style_line, title="lazul")  // DARK BLUE
plot(media, color=color.new(#FF0000, 0), title="media", style=plot.style_line, linewidth=2)  // RED
plot(bandacero, color=color.new(#000000, 0), title="cero")  // BLACK

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
float op_operation = decision_tree_0_NIO_5Min_9df7a9c3(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


