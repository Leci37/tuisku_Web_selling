//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: XLMUSDT_15Min_2BT0_a7b30314 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_2BT0_a7b30314", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_a7b30314(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.00076 )
		if( tema <= 0.120273 )
			if( ema2 <= 0.120406 )
				if( ema2 <= 0.115653 )
					if( bbm <= 0.000407 )
						if( ema12 <= -0.001044 )
							if( tema <= 0.099464 )
								if( tema <= 0.077607 )
									ret := -0.538462
								if( tema > 0.077607 )
									ret := 0.833333 // buy
							if( tema > 0.099464 )
								if( bullPower <= -0.00116 )
									ret := -0.571429
								if( bullPower > -0.00116 )
									ret := -1.000000 // sell
						if( ema12 > -0.001044 )
							if( bearPower <= -0.000911 )
								if( bbp <= -0.001467 )
									ret := 0.218182
								if( bbp > -0.001467 )
									ret := 0.700000 // buy
							if( bearPower > -0.000911 )
								if( bullPower <= -0.000254 )
									ret := 0.090562
								if( bullPower > -0.000254 )
									ret := -0.091241
					if( bbm > 0.000407 )
						if( ema2 <= 0.1112 )
							if( ema2 <= 0.109924 )
								if( bbp <= -0.002476 )
									ret := 0.343486
								if( bbp > -0.002476 )
									ret := 0.142198
							if( ema2 > 0.109924 )
								if( ema1 <= 0.109816 )
									ret := -0.553846
								if( ema1 > 0.109816 )
									ret := -0.094431
						if( ema2 > 0.1112 )
							if( bbp <= -0.004024 )
								if( tema <= 0.109874 )
									ret := 0.057692
								if( tema > 0.109874 )
									ret := -0.720000 // sell
							if( bbp > -0.004024 )
								if( ema2 <= 0.112145 )
									ret := 0.571782
								if( ema2 > 0.112145 )
									ret := 0.289200
				if( ema2 > 0.115653 )
					if( ema1 <= 0.11568 )
						if( ema12 <= -0.000477 )
							if( ema3 <= 0.120387 )
								if( ema13 <= -0.002188 )
									ret := -0.609756
								if( ema13 > -0.002188 )
									ret := 0.365591
							if( ema3 > 0.120387 )
								ret := 1.000000 // buy
						if( ema12 > -0.000477 )
							if( bearPower <= -0.000662 )
								if( bearPower <= -0.00106 )
									ret := -0.565217
								if( bearPower > -0.00106 )
									ret := -0.932203 // sell
							if( bearPower > -0.000662 )
								ret := -0.230769
					if( ema1 > 0.11568 )
						if( ema1 <= 0.116175 )
							if( tema <= 0.115687 )
								if( ema1 <= 0.115948 )
									ret := 0.298611
								if( ema1 > 0.115948 )
									ret := 0.779661 // buy
							if( tema > 0.115687 )
								if( ema12 <= -0.000116 )
									ret := -0.650000
								if( ema12 > -0.000116 )
									ret := 0.950000 // buy
						if( ema1 > 0.116175 )
							if( ema1 <= 0.117675 )
								if( ema13 <= -0.002153 )
									ret := -1.000000 // sell
								if( ema13 > -0.002153 )
									ret := -0.095602
							if( ema1 > 0.117675 )
								if( tema <= 0.117556 )
									ret := 0.387097
								if( tema > 0.117556 )
									ret := -0.023370
			if( ema2 > 0.120406 )
				if( ema13 <= -0.000626 )
					if( bearPower <= -0.001515 )
						if( bbm <= 0.001 )
							if( bullPower <= -0.001205 )
								ret := 0.250000
							if( bullPower > -0.001205 )
								if( bearPower <= -0.001591 )
									ret := 1.000000 // buy
								if( bearPower > -0.001591 )
									ret := 0.700000 // buy
						if( bbm > 0.001 )
							if( bullPower <= -0.000326 )
								if( ema12 <= -0.00114 )
									ret := 0.385542
								if( ema12 > -0.00114 )
									ret := -0.151163
							if( bullPower > -0.000326 )
								if( ema2 <= 0.121228 )
									ret := 0.444444
								if( ema2 > 0.121228 )
									ret := 1.000000 // buy
					if( bearPower > -0.001515 )
						if( ema3 <= 0.122066 )
							if( ema1 <= 0.120316 )
								if( bbm <= 0.00053 )
									ret := 0.153846
								if( bbm > 0.00053 )
									ret := 0.666667
							if( ema1 > 0.120316 )
								if( ema3 <= 0.121828 )
									ret := -0.358491
								if( ema3 > 0.121828 )
									ret := 0.600000
						if( ema3 > 0.122066 )
							ret := -0.809524 // sell
				if( ema13 > -0.000626 )
					if( ema1 <= 0.120774 )
						if( bearPower <= -0.000866 )
							if( ema2 <= 0.120886 )
								if( ema12 <= -0.000278 )
									ret := 0.560000
								if( ema12 > -0.000278 )
									ret := 0.978261 // buy
							if( ema2 > 0.120886 )
								ret := 1.000000 // buy
						if( bearPower > -0.000866 )
							if( ema3 <= 0.120723 )
								ret := 0.230769
							if( ema3 > 0.120723 )
								if( ema2 <= 0.120711 )
									ret := 0.892857 // buy
								if( ema2 > 0.120711 )
									ret := 0.478261
					if( ema1 > 0.120774 )
						ret := 0.000000
		if( tema > 0.120273 )
			if( bbp <= -0.003611 )
				if( tema <= 0.128095 )
					if( ema2 <= 0.131259 )
						if( bullPower <= -0.002537 )
							if( bullPower <= -0.00291 )
								ret := 1.000000 // buy
							if( bullPower > -0.00291 )
								ret := 0.400000
						if( bullPower > -0.002537 )
							if( ema3 <= 0.125167 )
								if( tema <= 0.121684 )
									ret := -0.500000
								if( tema > 0.121684 )
									ret := 0.954545 // buy
							if( ema3 > 0.125167 )
								if( ema3 <= 0.127145 )
									ret := -0.946667 // sell
								if( ema3 > 0.127145 )
									ret := -0.328502
					if( ema2 > 0.131259 )
						ret := 1.000000 // buy
				if( tema > 0.128095 )
					if( ema13 <= -0.005143 )
						if( bbm <= 0.003199 )
							if( ema3 <= 0.159836 )
								ret := -0.888889 // sell
							if( ema3 > 0.159836 )
								ret := -1.000000 // sell
						if( bbm > 0.003199 )
							ret := 0.294118
					if( ema13 > -0.005143 )
						if( bullPower <= -0.002103 )
							if( tema <= 0.137633 )
								if( bbp <= -0.006407 )
									ret := -0.695652
								if( bbp > -0.006407 )
									ret := 0.875000 // buy
							if( tema > 0.137633 )
								if( bearPower <= -0.003604 )
									ret := 0.442308
								if( bearPower > -0.003604 )
									ret := -0.833333 // sell
						if( bullPower > -0.002103 )
							if( bullPower <= -0.001456 )
								if( ema3 <= 0.141563 )
									ret := 0.912000 // buy
								if( ema3 > 0.141563 )
									ret := 0.441026
							if( bullPower > -0.001456 )
								if( ema1 <= 0.133423 )
									ret := 0.742424 // buy
								if( ema1 > 0.133423 )
									ret := 0.250646
			if( bbp > -0.003611 )
				if( ema1 <= 0.148132 )
					if( ema2 <= 0.122575 )
						if( ema12 <= -0.000165 )
							if( ema1 <= 0.121843 )
								if( ema2 <= 0.122426 )
									ret := 0.229773
								if( ema2 > 0.122426 )
									ret := -0.529412
							if( ema1 > 0.121843 )
								if( ema2 <= 0.122238 )
									ret := 0.130435
								if( ema2 > 0.122238 )
									ret := 0.814159 // buy
						if( ema12 > -0.000165 )
							if( ema2 <= 0.12232 )
								if( ema13 <= -4.9e-05 )
									ret := -0.680851
								if( ema13 > -4.9e-05 )
									ret := -0.057692
							if( ema2 > 0.12232 )
								if( ema1 <= 0.122286 )
									ret := 1.000000 // buy
								if( ema1 > 0.122286 )
									ret := 0.200000
					if( ema2 > 0.122575 )
						if( ema13 <= 0.000397 )
							if( ema2 <= 0.123107 )
								if( ema13 <= -0.001123 )
									ret := 0.666667
								if( ema13 > -0.001123 )
									ret := -0.693431
							if( ema2 > 0.123107 )
								if( ema13 <= -0.000879 )
									ret := 0.107616
								if( ema13 > -0.000879 )
									ret := -0.028500
						if( ema13 > 0.000397 )
							if( ema13 <= 0.000497 )
								if( tema <= 0.130012 )
									ret := 0.428571
								if( tema > 0.130012 )
									ret := 0.857143 // buy
							if( ema13 > 0.000497 )
								if( ema13 <= 0.000541 )
									ret := -0.333333
								if( ema13 > 0.000541 )
									ret := 0.568627
				if( ema1 > 0.148132 )
					if( tema <= 0.152761 )
						if( tema <= 0.150718 )
							if( ema3 <= 0.151738 )
								if( bbp <= -0.000872 )
									ret := -0.449495
								if( bbp > -0.000872 )
									ret := 0.800000 // buy
							if( ema3 > 0.151738 )
								if( ema2 <= 0.151937 )
									ret := 0.266667
								if( ema2 > 0.151937 )
									ret := 0.866667 // buy
						if( tema > 0.150718 )
							if( ema13 <= -0.000926 )
								ret := -0.285714
							if( ema13 > -0.000926 )
								if( ema13 <= -0.000404 )
									ret := -0.934426 // sell
								if( ema13 > -0.000404 )
									ret := -0.583333
					if( tema > 0.152761 )
						if( ema3 <= 0.15639 )
							if( ema3 <= 0.154601 )
								ret := -0.333333
							if( ema3 > 0.154601 )
								if( ema3 <= 0.155025 )
									ret := 1.000000 // buy
								if( ema3 > 0.155025 )
									ret := 0.695652
						if( ema3 > 0.15639 )
							if( ema12 <= -0.000783 )
								if( tema <= 0.161519 )
									ret := 0.797468 // buy
								if( tema > 0.161519 )
									ret := -0.130841
							if( ema12 > -0.000783 )
								if( tema <= 0.158733 )
									ret := -0.554622
								if( tema > 0.158733 )
									ret := -0.049161
	if( bbp > -0.00076 )
		if( ema2 <= 0.109872 )
			if( ema12 <= 0.001423 )
				if( bbp <= 0.003338 )
					if( ema1 <= 0.08761 )
						if( tema <= 0.087511 )
							if( ema12 <= 0.000606 )
								if( tema <= 0.087193 )
									ret := 0.057397
								if( tema > 0.087193 )
									ret := -0.128028
							if( ema12 > 0.000606 )
								if( bbm <= 0.000853 )
									ret := 0.600000
								if( bbm > 0.000853 )
									ret := -0.238806
						if( tema > 0.087511 )
							if( ema13 <= 0.002153 )
								if( ema12 <= -7e-06 )
									ret := -0.444444
								if( ema12 > -7e-06 )
									ret := 0.392461
							if( ema13 > 0.002153 )
								ret := -1.000000 // sell
					if( ema1 > 0.08761 )
						if( tema <= 0.100723 )
							if( ema2 <= 0.091722 )
								if( ema13 <= 0.000917 )
									ret := 0.005021
								if( ema13 > 0.000917 )
									ret := 0.332344
							if( ema2 > 0.091722 )
								if( bearPower <= -0.000277 )
									ret := 0.027959
								if( bearPower > -0.000277 )
									ret := -0.115685
						if( tema > 0.100723 )
							if( bbm <= 0.001561 )
								if( tema <= 0.101067 )
									ret := 0.585799
								if( tema > 0.101067 )
									ret := 0.020706
							if( bbm > 0.001561 )
								if( ema3 <= 0.109275 )
									ret := 0.162500
								if( ema3 > 0.109275 )
									ret := 0.951613 // buy
				if( bbp > 0.003338 )
					if( bullPower <= 0.00279 )
						if( ema2 <= 0.100541 )
							if( bullPower <= 0.002405 )
								ret := -0.333333
							if( bullPower > 0.002405 )
								ret := 0.583333
						if( ema2 > 0.100541 )
							if( ema13 <= 0.002122 )
								if( bearPower <= 0.001185 )
									ret := -0.136364
								if( bearPower > 0.001185 )
									ret := -0.690141
							if( ema13 > 0.002122 )
								ret := -1.000000 // sell
					if( bullPower > 0.00279 )
						if( tema <= 0.10578 )
							if( ema3 <= 0.101842 )
								if( ema1 <= 0.095731 )
									ret := 0.625000
								if( ema1 > 0.095731 )
									ret := 0.727273 // buy
							if( ema3 > 0.101842 )
								ret := 1.000000 // buy
						if( tema > 0.10578 )
							if( ema2 <= 0.108399 )
								if( tema <= 0.109098 )
									ret := -0.142857
								if( tema > 0.109098 )
									ret := -1.000000 // sell
							if( ema2 > 0.108399 )
								if( tema <= 0.111902 )
									ret := 0.900000 // buy
								if( tema > 0.111902 )
									ret := 0.200000
			if( ema12 > 0.001423 )
				if( ema13 <= 0.003806 )
					if( bbm <= 0.001381 )
						if( bullPower <= 0.002469 )
							ret := 0.933333 // buy
						if( bullPower > 0.002469 )
							ret := 1.000000 // buy
					if( bbm > 0.001381 )
						if( bullPower <= 0.004786 )
							if( bearPower <= 0.001634 )
								if( ema12 <= 0.001576 )
									ret := 1.000000 // buy
								if( ema12 > 0.001576 )
									ret := 0.909091 // buy
							if( bearPower > 0.001634 )
								ret := 0.437500
						if( bullPower > 0.004786 )
							ret := 1.000000 // buy
				if( ema13 > 0.003806 )
					if( ema12 <= 0.003464 )
						if( bbp <= 0.008298 )
							ret := 0.461538
						if( bbp > 0.008298 )
							ret := -1.000000 // sell
					if( ema12 > 0.003464 )
						ret := 1.000000 // buy
		if( ema2 > 0.109872 )
			if( ema13 <= 0.001313 )
				if( tema <= 0.142212 )
					if( ema2 <= 0.110892 )
						if( ema1 <= 0.110991 )
							if( bearPower <= -0.00072 )
								if( bbp <= -0.000692 )
									ret := -0.750000 // sell
								if( bbp > -0.000692 )
									ret := -0.966667 // sell
							if( bearPower > -0.00072 )
								if( bullPower <= 0.000622 )
									ret := -0.190000
								if( bullPower > 0.000622 )
									ret := 0.054902
						if( ema1 > 0.110991 )
							if( ema3 <= 0.110436 )
								if( tema <= 0.111682 )
									ret := -0.914286 // sell
								if( tema > 0.111682 )
									ret := -0.607143
							if( ema3 > 0.110436 )
								if( tema <= 0.11138 )
									ret := -0.764706 // sell
								if( tema > 0.11138 )
									ret := 0.129032
					if( ema2 > 0.110892 )
						if( bearPower <= 7.4e-05 )
							if( ema2 <= 0.112391 )
								if( bbm <= 0.001229 )
									ret := 0.094153
								if( bbm > 0.001229 )
									ret := -0.385714
							if( ema2 > 0.112391 )
								if( tema <= 0.116748 )
									ret := -0.089767
								if( tema > 0.116748 )
									ret := 0.003450
						if( bearPower > 7.4e-05 )
							if( tema <= 0.123956 )
								if( ema1 <= 0.111295 )
									ret := 0.406250
								if( ema1 > 0.111295 )
									ret := -0.132897
							if( tema > 0.123956 )
								if( ema13 <= 0.000632 )
									ret := -0.099035
								if( ema13 > 0.000632 )
									ret := 0.142129
				if( tema > 0.142212 )
					if( bbm <= 0.002817 )
						if( ema1 <= 0.168172 )
							if( ema1 <= 0.161394 )
								if( ema2 <= 0.142205 )
									ret := -0.655405
								if( ema2 > 0.142205 )
									ret := -0.136219
							if( ema1 > 0.161394 )
								if( bbm <= 0.001209 )
									ret := -0.746114 // sell
								if( bbm > 0.001209 )
									ret := -0.270677
						if( ema1 > 0.168172 )
							if( ema3 <= 0.169767 )
								if( bbp <= 0.000886 )
									ret := 0.982759 // buy
								if( bbp > 0.000886 )
									ret := 0.000000
							if( ema3 > 0.169767 )
								if( ema3 <= 0.185355 )
									ret := -0.032298
								if( ema3 > 0.185355 )
									ret := -0.522727
					if( bbm > 0.002817 )
						if( bbm <= 0.004736 )
							if( bbp <= 0.001169 )
								ret := -0.300000
							if( bbp > 0.001169 )
								if( ema13 <= 0.000379 )
									ret := 0.666667
								if( ema13 > 0.000379 )
									ret := 1.000000 // buy
						if( bbm > 0.004736 )
							ret := -0.615385
			if( ema13 > 0.001313 )
				if( bbm <= 0.000595 )
					if( ema3 <= 0.128776 )
						if( tema <= 0.125922 )
							if( bbp <= 0.002648 )
								if( bearPower <= 0.000563 )
									ret := 0.476190
								if( bearPower > 0.000563 )
									ret := -0.105263
							if( bbp > 0.002648 )
								if( ema1 <= 0.117292 )
									ret := -0.153846
								if( ema1 > 0.117292 )
									ret := 1.000000 // buy
						if( tema > 0.125922 )
							if( bearPower <= 0.00071 )
								ret := -0.692308
							if( bearPower > 0.00071 )
								ret := -0.894737 // sell
					if( ema3 > 0.128776 )
						if( ema1 <= 0.166374 )
							if( ema1 <= 0.131661 )
								if( ema13 <= 0.001525 )
									ret := 0.928571 // buy
								if( ema13 > 0.001525 )
									ret := 0.833333 // buy
							if( ema1 > 0.131661 )
								if( bullPower <= 0.001534 )
									ret := 0.470588
								if( bullPower > 0.001534 )
									ret := 0.764706 // buy
						if( ema1 > 0.166374 )
							if( tema <= 0.183697 )
								ret := -1.000000 // sell
							if( tema > 0.183697 )
								ret := 0.888889 // buy
				if( bbm > 0.000595 )
					if( tema <= 0.149462 )
						if( ema1 <= 0.136176 )
							if( ema12 <= 0.00271 )
								if( ema12 <= 0.001433 )
									ret := -0.274270
								if( ema12 > 0.001433 )
									ret := -0.612466
							if( ema12 > 0.00271 )
								if( ema13 <= 0.00566 )
									ret := 1.000000 // buy
								if( ema13 > 0.00566 )
									ret := 0.000000
						if( ema1 > 0.136176 )
							if( ema1 <= 0.148044 )
								if( ema12 <= 0.000698 )
									ret := -0.486486
								if( ema12 > 0.000698 )
									ret := 0.114530
							if( ema1 > 0.148044 )
								ret := 1.000000 // buy
					if( tema > 0.149462 )
						if( ema1 <= 0.159076 )
							if( bbm <= 0.006213 )
								if( bullPower <= 0.002207 )
									ret := -0.383838
								if( bullPower > 0.002207 )
									ret := -0.810700 // sell
							if( bbm > 0.006213 )
								if( tema <= 0.161668 )
									ret := 0.468750
								if( tema > 0.161668 )
									ret := -0.789474 // sell
						if( ema1 > 0.159076 )
							if( bbm <= 0.005742 )
								if( tema <= 0.164261 )
									ret := 0.054945
								if( tema > 0.164261 )
									ret := -0.627329
							if( bbm > 0.005742 )
								ret := 0.846154 // buy
	
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
float op_operation = decision_tree_0_XLMUSDT_15Min_a7b30314(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)

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


