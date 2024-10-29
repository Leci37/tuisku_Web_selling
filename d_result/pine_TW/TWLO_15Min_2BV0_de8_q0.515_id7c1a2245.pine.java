//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: TWLO_15Min_2BV0_7c1a2245 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2BV0_7c1a2245", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_7c1a2245(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.014121 )
		if( VIP <= 1.32444 )
			if( bbm <= 0.057866 )
				if( bearPower <= -0.342818 )
					if( VIP <= 1.00553 )
						if( VIP <= 0.890669 )
							if( VIP_VIM <= -0.683034 )
								if( VIM <= 1.5555 )
									ret := 0.592593
								if( VIM > 1.5555 )
									ret := 0.235955
							if( VIP_VIM > -0.683034 )
								if( bullPower <= -1.84805 )
									ret := 0.452830
								if( bullPower > -1.84805 )
									ret := 0.064838
						if( VIP > 0.890669 )
							if( bearPower <= -0.740981 )
								if( bearPower <= -1.68736 )
									ret := 0.637681
								if( bearPower > -1.68736 )
									ret := 0.208333
							if( bearPower > -0.740981 )
								if( bbp <= -0.704648 )
									ret := 0.615616
								if( bbp > -0.704648 )
									ret := -0.076923
					if( VIP > 1.00553 )
						if( VIP_VIM <= -0.765626 )
							if( VIP <= 1.25747 )
								if( bullPower <= -1.38784 )
									ret := 0.416667
								if( bullPower > -1.38784 )
									ret := -0.254545
							if( VIP > 1.25747 )
								ret := -1.000000 // sell
						if( VIP_VIM > -0.765626 )
							if( VIP <= 1.13696 )
								if( VIM <= 1.25838 )
									ret := -0.058824
								if( VIM > 1.25838 )
									ret := 0.241206
							if( VIP > 1.13696 )
								if( bullPower <= -4.36452 )
									ret := -0.727273 // sell
								if( bullPower > -4.36452 )
									ret := 0.325792
				if( bearPower > -0.342818 )
					if( bearPower <= -0.050188 )
						if( bbp <= -0.220946 )
							if( bbm <= 0.001219 )
								if( bbp <= -0.48568 )
									ret := -0.086022
								if( bbp > -0.48568 )
									ret := 0.185910
							if( bbm > 0.001219 )
								if( VIM <= 1.84932 )
									ret := 0.372197
								if( VIM > 1.84932 )
									ret := -0.294118
						if( bbp > -0.220946 )
							if( VIP_VIM <= -0.721307 )
								if( bbm <= 0.020291 )
									ret := 0.000000
								if( bbm > 0.020291 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.721307 )
								if( VIP <= 1.19585 )
									ret := 0.058617
								if( VIP > 1.19585 )
									ret := -0.239437
					if( bearPower > -0.050188 )
						if( VIP <= 1.18042 )
							if( VIM <= 1.17476 )
								if( bbm <= 0.005823 )
									ret := -0.130178
								if( bbm > 0.005823 )
									ret := 0.315789
							if( VIM > 1.17476 )
								if( bullPower <= -0.043202 )
									ret := 0.771429 // buy
								if( bullPower > -0.043202 )
									ret := 0.312102
						if( VIP > 1.18042 )
							if( VIP <= 1.2568 )
								if( VIP_VIM <= -0.276218 )
									ret := -0.363636
								if( VIP_VIM > -0.276218 )
									ret := 0.679688
							if( VIP > 1.2568 )
								if( VIP_VIM <= 0.113751 )
									ret := -0.333333
								if( VIP_VIM > 0.113751 )
									ret := 0.258065
			if( bbm > 0.057866 )
				if( bbp <= -5.39376 )
					if( bearPower <= -12.398 )
						if( VIP_VIM <= -0.967068 )
							if( bearPower <= -13.672 )
								ret := 0.166667
							if( bearPower > -13.672 )
								ret := -0.833333 // sell
						if( VIP_VIM > -0.967068 )
							if( bearPower <= -14.3049 )
								if( VIM <= 1.44111 )
									ret := -0.052632
								if( VIM > 1.44111 )
									ret := 0.750000 // buy
							if( bearPower > -14.3049 )
								if( VIP <= 0.854395 )
									ret := 0.937500 // buy
								if( VIP > 0.854395 )
									ret := 0.222222
					if( bearPower > -12.398 )
						if( bbm <= 2.30539 )
							if( VIP_VIM <= -1.09988 )
								if( bullPower <= -3.40159 )
									ret := -0.947368 // sell
								if( bullPower > -3.40159 )
									ret := -0.200000
							if( VIP_VIM > -1.09988 )
								if( VIP_VIM <= -0.310104 )
									ret := 0.135977
								if( VIP_VIM > -0.310104 )
									ret := -0.239130
						if( bbm > 2.30539 )
							if( bbm <= 6.67777 )
								if( VIM <= 1.51275 )
									ret := -0.136947
								if( VIM > 1.51275 )
									ret := -0.403974
							if( bbm > 6.67777 )
								if( bbm <= 9.73439 )
									ret := 0.408759
								if( bbm > 9.73439 )
									ret := -0.370968
				if( bbp > -5.39376 )
					if( VIM <= 1.21433 )
						if( bullPower <= 2.30261 )
							if( bullPower <= 0.922777 )
								if( bullPower <= 0.624081 )
									ret := 0.037868
								if( bullPower > 0.624081 )
									ret := -0.084198
							if( bullPower > 0.922777 )
								if( VIM <= 0.849281 )
									ret := 0.309524
								if( VIM > 0.849281 )
									ret := 0.076032
						if( bullPower > 2.30261 )
							if( bbp <= 2.08953 )
								if( bbm <= 2.80126 )
									ret := -0.815789 // sell
								if( bbm > 2.80126 )
									ret := -0.248260
							if( bbp > 2.08953 )
								if( bbm <= 11.615 )
									ret := 0.108453
								if( bbm > 11.615 )
									ret := -0.720000 // sell
					if( VIM > 1.21433 )
						if( VIM <= 1.8988 )
							if( bbm <= 0.30059 )
								if( bbp <= -2.55324 )
									ret := -0.206186
								if( bbp > -2.55324 )
									ret := 0.040733
							if( bbm > 0.30059 )
								if( bearPower <= -0.223466 )
									ret := 0.131564
								if( bearPower > -0.223466 )
									ret := -0.067729
						if( VIM > 1.8988 )
							if( bbp <= -0.187942 )
								if( bbm <= 0.585003 )
									ret := -0.450617
								if( bbm > 0.585003 )
									ret := -0.047619
							if( bbp > -0.187942 )
								if( bearPower <= -0.075601 )
									ret := 0.833333 // buy
								if( bearPower > -0.075601 )
									ret := -0.500000
		if( VIP > 1.32444 )
			if( bearPower <= -1.59344 )
				if( bbm <= 1.72687 )
					if( VIP <= 4.68584 )
						if( bearPower <= -6.4481 )
							if( bbp <= -13.4314 )
								if( bullPower <= -8.60564 )
									ret := 0.933333 // buy
								if( bullPower > -8.60564 )
									ret := 0.250000
							if( bbp > -13.4314 )
								ret := 1.000000 // buy
						if( bearPower > -6.4481 )
							if( bearPower <= -1.61636 )
								if( bullPower <= -0.288184 )
									ret := 0.145188
								if( bullPower > -0.288184 )
									ret := 1.000000 // buy
							if( bearPower > -1.61636 )
								if( bbp <= -3.18454 )
									ret := -1.000000 // sell
								if( bbp > -3.18454 )
									ret := -0.100000
					if( VIP > 4.68584 )
						if( bullPower <= -2.05311 )
							if( VIP <= 7.18637 )
								ret := -1.000000 // sell
							if( VIP > 7.18637 )
								if( bearPower <= -2.66957 )
									ret := -0.500000
								if( bearPower > -2.66957 )
									ret := -1.000000 // sell
						if( bullPower > -2.05311 )
							ret := -0.250000
				if( bbm > 1.72687 )
					if( VIP_VIM <= 0.162782 )
						if( bbp <= -18.448 )
							ret := 0.833333 // buy
						if( bbp > -18.448 )
							if( VIM <= 2.6318 )
								if( bbp <= -3.57722 )
									ret := -0.028037
								if( bbp > -3.57722 )
									ret := -0.322034
							if( VIM > 2.6318 )
								if( VIP <= 2.3985 )
									ret := -0.750000 // sell
								if( VIP > 2.3985 )
									ret := -1.000000 // sell
					if( VIP_VIM > 0.162782 )
						if( bullPower <= 2.43007 )
							if( VIM <= 1.43386 )
								if( VIP <= 1.61416 )
									ret := 0.909091 // buy
								if( VIP > 1.61416 )
									ret := 0.000000
							if( VIM > 1.43386 )
								if( VIP_VIM <= 0.612656 )
									ret := -0.428571
								if( VIP_VIM > 0.612656 )
									ret := 0.833333 // buy
						if( bullPower > 2.43007 )
							if( VIP <= 1.42553 )
								if( bearPower <= -2.60725 )
									ret := 0.750000 // buy
								if( bearPower > -2.60725 )
									ret := 0.125000
							if( VIP > 1.42553 )
								if( bbm <= 8.57 )
									ret := -0.200000
								if( bbm > 8.57 )
									ret := -1.000000 // sell
			if( bearPower > -1.59344 )
				if( VIP <= 2.30963 )
					if( bbp <= -0.618179 )
						if( VIP_VIM <= -0.761546 )
							if( VIP <= 1.85461 )
								if( bullPower <= -0.529009 )
									ret := -0.735294 // sell
								if( bullPower > -0.529009 )
									ret := -0.093750
							if( VIP > 1.85461 )
								if( bullPower <= -0.64019 )
									ret := -0.500000
								if( bullPower > -0.64019 )
									ret := 0.888889 // buy
						if( VIP_VIM > -0.761546 )
							if( bullPower <= -1.42858 )
								if( bearPower <= -1.57399 )
									ret := 1.000000 // buy
								if( bearPower > -1.57399 )
									ret := -0.571429
							if( bullPower > -1.42858 )
								if( VIP_VIM <= -0.494622 )
									ret := 0.678218
								if( VIP_VIM > -0.494622 )
									ret := 0.356322
					if( bbp > -0.618179 )
						if( bbm <= 4.374 )
							if( bbp <= 1.16314 )
								if( bbp <= 0.535422 )
									ret := 0.141176
								if( bbp > 0.535422 )
									ret := 0.423197
							if( bbp > 1.16314 )
								if( VIM <= 1.54371 )
									ret := -0.172727
								if( VIM > 1.54371 )
									ret := 0.700000 // buy
						if( bbm > 4.374 )
							if( bbm <= 4.7875 )
								if( bbm <= 4.51228 )
									ret := 0.500000
								if( bbm > 4.51228 )
									ret := 1.000000 // buy
							if( bbm > 4.7875 )
								if( bearPower <= -0.993018 )
									ret := 0.857143 // buy
								if( bearPower > -0.993018 )
									ret := 0.160000
				if( VIP > 2.30963 )
					if( VIP_VIM <= -0.712881 )
						if( VIP <= 4.78521 )
							if( VIP_VIM <= -0.82661 )
								if( bullPower <= -0.161524 )
									ret := 0.156250
								if( bullPower > -0.161524 )
									ret := -0.769231 // sell
							if( VIP_VIM > -0.82661 )
								if( bbm <= 0.175309 )
									ret := 0.222222
								if( bbm > 0.175309 )
									ret := 1.000000 // buy
						if( VIP > 4.78521 )
							if( VIP <= 9.43584 )
								if( bbp <= -0.717283 )
									ret := 1.000000 // buy
								if( bbp > -0.717283 )
									ret := 0.750000 // buy
							if( VIP > 9.43584 )
								ret := 0.000000
					if( VIP_VIM > -0.712881 )
						if( VIP_VIM <= 0.825598 )
							if( VIP <= 8.83252 )
								if( bullPower <= -0.744396 )
									ret := 0.270677
								if( bullPower > -0.744396 )
									ret := -0.038781
							if( VIP > 8.83252 )
								if( bearPower <= -0.302313 )
									ret := -0.916667 // sell
								if( bearPower > -0.302313 )
									ret := -0.200000
						if( VIP_VIM > 0.825598 )
							if( bbm <= 0.15768 )
								if( VIM <= 2.07165 )
									ret := 0.176471
								if( VIM > 2.07165 )
									ret := 0.815789 // buy
							if( bbm > 0.15768 )
								if( bearPower <= -0.210224 )
									ret := -0.857143 // sell
								if( bearPower > -0.210224 )
									ret := -0.250000
	if( bearPower > -0.014121 )
		if( VIM <= 1.21639 )
			if( VIP <= 1.59978 )
				if( bullPower <= 2.90747 )
					if( bullPower <= 0.053511 )
						if( VIP_VIM <= 0.316611 )
							if( VIP_VIM <= -0.186858 )
								if( VIP <= 0.946493 )
									ret := -0.028571
								if( VIP > 0.946493 )
									ret := -0.724138 // sell
							if( VIP_VIM > -0.186858 )
								if( VIP <= 1.44088 )
									ret := 0.135385
								if( VIP > 1.44088 )
									ret := -1.000000 // sell
						if( VIP_VIM > 0.316611 )
							if( bearPower <= 0.008582 )
								if( bullPower <= -0.009997 )
									ret := 0.500000
								if( bullPower > -0.009997 )
									ret := -0.047619
							if( bearPower > 0.008582 )
								if( VIM <= 0.817809 )
									ret := 0.083333
								if( VIM > 0.817809 )
									ret := 0.691489
					if( bullPower > 0.053511 )
						if( VIP_VIM <= 0.786399 )
							if( bbp <= 2.28598 )
								if( bbp <= 1.73232 )
									ret := 0.019445
								if( bbp > 1.73232 )
									ret := -0.062020
							if( bbp > 2.28598 )
								if( VIM <= 0.765385 )
									ret := -0.060317
								if( VIM > 0.765385 )
									ret := 0.134243
						if( VIP_VIM > 0.786399 )
							if( bullPower <= 1.92016 )
								if( bbp <= 2.02893 )
									ret := -0.138889
								if( bbp > 2.02893 )
									ret := 0.171642
							if( bullPower > 1.92016 )
								if( VIM <= 0.714621 )
									ret := -0.311828
								if( VIM > 0.714621 )
									ret := -0.950000 // sell
				if( bullPower > 2.90747 )
					if( VIP <= 1.27004 )
						if( bbp <= 11.1398 )
							if( bearPower <= 0.883111 )
								if( bbp <= 3.48391 )
									ret := 0.470588
								if( bbp > 3.48391 )
									ret := -0.064189
							if( bearPower > 0.883111 )
								if( bbp <= 4.41743 )
									ret := -0.537500
								if( bbp > 4.41743 )
									ret := -0.187010
						if( bbp > 11.1398 )
							if( bbp <= 13.2037 )
								if( bbm <= 6.0818 )
									ret := 0.617647
								if( bbm > 6.0818 )
									ret := 0.928571 // buy
							if( bbp > 13.2037 )
								if( bbp <= 16.501 )
									ret := -0.200000
								if( bbp > 16.501 )
									ret := -1.000000 // sell
					if( VIP > 1.27004 )
						if( bbm <= 1.60337 )
							if( bearPower <= 2.26607 )
								if( bullPower <= 3.0487 )
									ret := -0.322034
								if( bullPower > 3.0487 )
									ret := 0.250000
							if( bearPower > 2.26607 )
								if( bullPower <= 3.67542 )
									ret := 0.016667
								if( bullPower > 3.67542 )
									ret := -0.366812
						if( bbm > 1.60337 )
							if( bbp <= 18.6542 )
								if( bullPower <= 10.2159 )
									ret := 0.042975
								if( bullPower > 10.2159 )
									ret := 0.580645
							if( bbp > 18.6542 )
								if( bbp <= 49.3512 )
									ret := -0.340426
								if( bbp > 49.3512 )
									ret := -1.000000 // sell
			if( VIP > 1.59978 )
				if( VIM <= 1.0392 )
					if( bullPower <= 0.072812 )
						if( VIP <= 1.61797 )
							ret := 1.000000 // buy
						if( VIP > 1.61797 )
							if( VIP_VIM <= 0.862919 )
								if( bearPower <= 0.016975 )
									ret := 0.000000
								if( bearPower > 0.016975 )
									ret := 0.375000
							if( VIP_VIM > 0.862919 )
								if( bearPower <= 0.041004 )
									ret := -0.545455
								if( bearPower > 0.041004 )
									ret := -1.000000 // sell
					if( bullPower > 0.072812 )
						if( bullPower <= 5.9182 )
							if( bearPower <= 0.900916 )
								if( VIM <= 0.826923 )
									ret := -0.130435
								if( VIM > 0.826923 )
									ret := 0.362712
							if( bearPower > 0.900916 )
								if( bbm <= 0.154667 )
									ret := 0.258065
								if( bbm > 0.154667 )
									ret := 0.516949
						if( bullPower > 5.9182 )
							if( bearPower <= 6.69197 )
								if( VIM <= 0.744299 )
									ret := 0.294118
								if( VIM > 0.744299 )
									ret := -0.464789
							if( bearPower > 6.69197 )
								if( VIM <= 0.414602 )
									ret := -1.000000 // sell
								if( VIM > 0.414602 )
									ret := 0.781250 // buy
				if( VIM > 1.0392 )
					if( bbm <= 0.005878 )
						if( VIP <= 1.66146 )
							if( VIP <= 1.64547 )
								if( VIP <= 1.63018 )
									ret := 0.222222
								if( VIP > 1.63018 )
									ret := -0.125000
							if( VIP > 1.64547 )
								ret := 0.714286 // buy
						if( VIP > 1.66146 )
							if( bullPower <= 0.462788 )
								if( VIP_VIM <= 0.612636 )
									ret := -0.555556
								if( VIP_VIM > 0.612636 )
									ret := 0.250000
							if( bullPower > 0.462788 )
								if( bbp <= 2.10315 )
									ret := -0.644444
								if( bbp > 2.10315 )
									ret := -0.142857
					if( bbm > 0.005878 )
						if( bullPower <= 0.233636 )
							if( bbm <= 0.025842 )
								ret := 0.166667
							if( bbm > 0.025842 )
								if( bbp <= 0.177821 )
									ret := 0.500000
								if( bbp > 0.177821 )
									ret := 0.913043 // buy
						if( bullPower > 0.233636 )
							if( VIP <= 2.00638 )
								if( bearPower <= 0.076477 )
									ret := -0.400000
								if( bearPower > 0.076477 )
									ret := 0.151351
							if( VIP > 2.00638 )
								if( bullPower <= 1.0689 )
									ret := -0.375000
								if( bullPower > 1.0689 )
									ret := -0.750000 // sell
		if( VIM > 1.21639 )
			if( bbm <= 0.005484 )
				if( VIP_VIM <= -0.571965 )
					if( bbp <= 3.98166 )
						if( bearPower <= 0.04838 )
							if( bearPower <= 0.040078 )
								if( VIM <= 1.53525 )
									ret := -0.800000 // sell
								if( VIM > 1.53525 )
									ret := 0.041667
							if( bearPower > 0.040078 )
								ret := 0.600000
						if( bearPower > 0.04838 )
							if( bbm <= 0 )
								if( VIM <= 7.75701 )
									ret := -0.478723
								if( VIM > 7.75701 )
									ret := 0.125000
							if( bbm > 0 )
								ret := -1.000000 // sell
					if( bbp > 3.98166 )
						if( bbp <= 4.13112 )
							ret := 1.000000 // buy
						if( bbp > 4.13112 )
							ret := -0.250000
				if( VIP_VIM > -0.571965 )
					if( VIP_VIM <= -0.224579 )
						if( VIP <= 1.72668 )
							if( bearPower <= 0.004341 )
								if( VIP_VIM <= -0.451611 )
									ret := 0.625000
								if( VIP_VIM > -0.451611 )
									ret := 0.028571
							if( bearPower > 0.004341 )
								if( VIM <= 1.3103 )
									ret := -0.707071 // sell
								if( VIM > 1.3103 )
									ret := -0.184116
						if( VIP > 1.72668 )
							if( bullPower <= 0.699336 )
								if( VIM <= 3.29963 )
									ret := -0.038462
								if( VIM > 3.29963 )
									ret := 0.470588
							if( bullPower > 0.699336 )
								if( bbp <= 4.79594 )
									ret := -0.481481
								if( bbp > 4.79594 )
									ret := 0.600000
					if( VIP_VIM > -0.224579 )
						if( bbp <= 1.4808 )
							if( bbp <= 0.92453 )
								if( bullPower <= 0.113359 )
									ret := 0.019231
								if( bullPower > 0.113359 )
									ret := -0.152455
							if( bbp > 0.92453 )
								if( VIP <= 1.26709 )
									ret := 0.565217
								if( VIP > 1.26709 )
									ret := -0.451613
						if( bbp > 1.4808 )
							if( bbp <= 6.92222 )
								if( VIP <= 1.8263 )
									ret := 0.276364
								if( VIP > 1.8263 )
									ret := -0.048327
							if( bbp > 6.92222 )
								if( VIP <= 1.65659 )
									ret := 0.000000
								if( VIP > 1.65659 )
									ret := -0.750000 // sell
			if( bbm > 0.005484 )
				if( bbp <= 2.73981 )
					if( bearPower <= 0.367576 )
						if( bbp <= 0.498247 )
							if( VIP <= 1.48322 )
								if( VIP <= 1.0664 )
									ret := 0.238938
								if( VIP > 1.0664 )
									ret := -0.125000
							if( VIP > 1.48322 )
								if( VIM <= 2.27452 )
									ret := 0.160714
								if( VIM > 2.27452 )
									ret := -0.072289
						if( bbp > 0.498247 )
							if( VIP <= 2.31553 )
								if( VIP <= 1.95623 )
									ret := -0.125000
								if( VIP > 1.95623 )
									ret := 0.255708
							if( VIP > 2.31553 )
								if( VIP <= 3.17769 )
									ret := -0.565445
								if( VIP > 3.17769 )
									ret := 0.162500
					if( bearPower > 0.367576 )
						if( bbm <= 0.425498 )
							if( bearPower <= 0.730864 )
								if( VIP_VIM <= -0.872397 )
									ret := -0.727273 // sell
								if( VIP_VIM > -0.872397 )
									ret := 0.130125
							if( bearPower > 0.730864 )
								if( VIM <= 2.48357 )
									ret := -0.253061
								if( VIM > 2.48357 )
									ret := 0.130435
						if( bbm > 0.425498 )
							if( VIP <= 1.62594 )
								if( bbp <= 2.35128 )
									ret := -0.188406
								if( bbp > 2.35128 )
									ret := 0.548387
							if( VIP > 1.62594 )
								if( VIP <= 2.92722 )
									ret := 0.478049
								if( VIP > 2.92722 )
									ret := -0.083333
				if( bbp > 2.73981 )
					if( bbm <= 0.024924 )
						if( bbp <= 3.07316 )
							ret := -0.714286 // sell
						if( bbp > 3.07316 )
							if( bullPower <= 1.93958 )
								if( bbp <= 3.54494 )
									ret := 0.555556
								if( bbp > 3.54494 )
									ret := 1.000000 // buy
							if( bullPower > 1.93958 )
								if( bearPower <= 2.11371 )
									ret := -0.600000
								if( bearPower > 2.11371 )
									ret := 0.450000
					if( bbm > 0.024924 )
						if( VIP_VIM <= 0.924826 )
							if( VIM <= 1.5204 )
								if( bullPower <= 2.19807 )
									ret := -0.363636
								if( bullPower > 2.19807 )
									ret := 0.024155
							if( VIM > 1.5204 )
								if( bearPower <= 3.31232 )
									ret := -0.452471
								if( bearPower > 3.31232 )
									ret := 0.069444
						if( VIP_VIM > 0.924826 )
							if( bbp <= 5.03165 )
								if( VIM <= 1.57579 )
									ret := 0.416667
								if( VIM > 1.57579 )
									ret := 1.000000 // buy
							if( bbp > 5.03165 )
								ret := -0.166667
	
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
float op_operation = decision_tree_0_TWLO_15Min_7c1a2245(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


