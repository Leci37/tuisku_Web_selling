//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ETSY_15Min_2BV0_930837a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_2BV0_930837a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_930837a6(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= 0.073342 )
		if( bbm <= 0.086545 )
			if( bullPower <= -0.063462 )
				if( VIM <= 2.34316 )
					if( VIP_VIM <= -0.772237 )
						if( bearPower <= -0.362244 )
							if( bbm <= 0.010494 )
								if( bbm <= 0.009307 )
									ret := 0.570552
								if( bbm > 0.009307 )
									ret := -0.375000
							if( bbm > 0.010494 )
								if( VIM <= 1.72537 )
									ret := 0.500000
								if( VIM > 1.72537 )
									ret := 0.913043 // buy
						if( bearPower > -0.362244 )
							if( bullPower <= -0.263765 )
								if( VIP_VIM <= -0.823186 )
									ret := -0.807692 // sell
								if( VIP_VIM > -0.823186 )
									ret := 0.500000
							if( bullPower > -0.263765 )
								if( VIM <= 1.59289 )
									ret := 0.145455
								if( VIM > 1.59289 )
									ret := 0.827586 // buy
					if( VIP_VIM > -0.772237 )
						if( VIP_VIM <= 0.01078 )
							if( bearPower <= -2.84544 )
								if( bearPower <= -3.37391 )
									ret := 0.454545
								if( bearPower > -3.37391 )
									ret := 0.960000 // buy
							if( bearPower > -2.84544 )
								if( VIP <= 0.783248 )
									ret := 0.279352
								if( VIP > 0.783248 )
									ret := 0.136646
						if( VIP_VIM > 0.01078 )
							if( VIP <= 2.10233 )
								if( VIP_VIM <= 0.397912 )
									ret := 0.299771
								if( VIP_VIM > 0.397912 )
									ret := 0.608209
							if( VIP > 2.10233 )
								if( VIP_VIM <= 0.201777 )
									ret := -0.435897
								if( VIP_VIM > 0.201777 )
									ret := 0.120879
				if( VIM > 2.34316 )
					if( bearPower <= -0.116697 )
						if( VIP <= 9.88336 )
							if( bearPower <= -0.39906 )
								if( VIP_VIM <= -1.3397 )
									ret := -0.680000
								if( VIP_VIM > -1.3397 )
									ret := 0.059946
							if( bearPower > -0.39906 )
								if( VIP_VIM <= 0.243377 )
									ret := -0.077348
								if( VIP_VIM > 0.243377 )
									ret := -0.577465
						if( VIP > 9.88336 )
							if( bbp <= -0.615845 )
								if( bbp <= -0.762129 )
									ret := 0.500000
								if( bbp > -0.762129 )
									ret := 1.000000 // buy
							if( bbp > -0.615845 )
								ret := 0.285714
					if( bearPower > -0.116697 )
						if( bbm <= 0.000758 )
							if( VIM <= 3.14644 )
								if( VIP <= 1.67746 )
									ret := 0.000000
								if( VIP > 1.67746 )
									ret := 0.760000 // buy
							if( VIM > 3.14644 )
								if( bbp <= -0.199408 )
									ret := 0.000000
								if( bbp > -0.199408 )
									ret := 0.375000
						if( bbm > 0.000758 )
							if( bbm <= 0.008625 )
								ret := 1.000000 // buy
							if( bbm > 0.008625 )
								if( bbm <= 0.020183 )
									ret := 0.500000
								if( bbm > 0.020183 )
									ret := 1.000000 // buy
			if( bullPower > -0.063462 )
				if( VIP_VIM <= 0.512502 )
					if( bearPower <= 0.048945 )
						if( bbp <= 0.025356 )
							if( bearPower <= -0.029864 )
								if( VIM <= 2.60667 )
									ret := 0.095174
								if( VIM > 2.60667 )
									ret := 0.689655
							if( bearPower > -0.029864 )
								if( VIP <= 1.11428 )
									ret := 0.075508
								if( VIP > 1.11428 )
									ret := -0.128440
						if( bbp > 0.025356 )
							if( VIP_VIM <= -0.246238 )
								if( bbp <= 0.04231 )
									ret := 0.333333
								if( bbp > 0.04231 )
									ret := -0.196429
							if( VIP_VIM > -0.246238 )
								if( VIP_VIM <= 0.303103 )
									ret := 0.210490
								if( VIP_VIM > 0.303103 )
									ret := 0.045326
					if( bearPower > 0.048945 )
						if( VIP <= 1.80953 )
							if( VIP <= 1.57585 )
								if( bbp <= 0.139536 )
									ret := -0.164336
								if( bbp > 0.139536 )
									ret := 0.255814
							if( VIP > 1.57585 )
								if( VIM <= 2.15591 )
									ret := -0.450000
								if( VIM > 2.15591 )
									ret := -1.000000 // sell
						if( VIP > 1.80953 )
							if( VIP_VIM <= -0.225046 )
								if( VIP <= 2.15501 )
									ret := 0.500000
								if( VIP > 2.15501 )
									ret := -0.750000 // sell
							if( VIP_VIM > -0.225046 )
								if( VIM <= 1.88648 )
									ret := 0.166667
								if( VIM > 1.88648 )
									ret := 0.764706 // buy
				if( VIP_VIM > 0.512502 )
					if( VIM <= 1.46614 )
						if( VIP <= 1.27216 )
							ret := 1.000000 // buy
						if( VIP > 1.27216 )
							if( bbm <= 0.019769 )
								if( VIP <= 1.34356 )
									ret := 0.913043 // buy
								if( VIP > 1.34356 )
									ret := 0.469388
							if( bbm > 0.019769 )
								if( VIM <= 1.04307 )
									ret := 0.050000
								if( VIM > 1.04307 )
									ret := 0.800000 // buy
					if( VIM > 1.46614 )
						if( VIP_VIM <= 0.70014 )
							if( VIP <= 2.95774 )
								ret := -0.571429
							if( VIP > 2.95774 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.70014 )
							if( VIM <= 6.53675 )
								if( bbp <= 0.049228 )
									ret := 0.000000
								if( bbp > 0.049228 )
									ret := 0.250000
							if( VIM > 6.53675 )
								ret := 0.666667
		if( bbm > 0.086545 )
			if( VIP <= 0.82892 )
				if( VIP_VIM <= -0.811997 )
					if( bbm <= 1.79519 )
						if( bullPower <= -0.501772 )
							if( bearPower <= -2.26159 )
								if( VIP <= 0.461618 )
									ret := 1.000000 // buy
								if( VIP > 0.461618 )
									ret := 0.202479
							if( bearPower > -2.26159 )
								if( bbm <= 0.44995 )
									ret := 0.250000
								if( bbm > 0.44995 )
									ret := 0.751592 // buy
						if( bullPower > -0.501772 )
							if( bbp <= -0.511928 )
								if( VIP_VIM <= -0.881831 )
									ret := -0.263158
								if( VIP_VIM > -0.881831 )
									ret := 0.275862
							if( bbp > -0.511928 )
								if( VIP_VIM <= -0.93703 )
									ret := -0.090909
								if( VIP_VIM > -0.93703 )
									ret := 0.777778 // buy
					if( bbm > 1.79519 )
						if( VIP <= 0.572401 )
							if( bbm <= 4.98349 )
								if( bearPower <= -4.4761 )
									ret := 0.379747
								if( bearPower > -4.4761 )
									ret := -0.666667
							if( bbm > 4.98349 )
								if( bullPower <= -8.1793 )
									ret := 0.000000
								if( bullPower > -8.1793 )
									ret := -0.809524 // sell
						if( VIP > 0.572401 )
							if( bbm <= 7.07409 )
								if( bearPower <= -6.21904 )
									ret := -0.657534
								if( bearPower > -6.21904 )
									ret := -0.102041
							if( bbm > 7.07409 )
								ret := 1.000000 // buy
				if( VIP_VIM > -0.811997 )
					if( bullPower <= -1.75208 )
						if( VIP <= 0.729703 )
							if( bbm <= 2.8046 )
								if( bbp <= -8.05715 )
									ret := -0.209302
								if( bbp > -8.05715 )
									ret := 0.080460
							if( bbm > 2.8046 )
								if( VIP_VIM <= -0.742832 )
									ret := -0.185185
								if( VIP_VIM > -0.742832 )
									ret := 0.539683
						if( VIP > 0.729703 )
							if( VIM <= 1.17118 )
								if( bbp <= -6.06125 )
									ret := 0.925926 // buy
								if( bbp > -6.06125 )
									ret := 0.200000
							if( VIM > 1.17118 )
								if( bullPower <= -2.8637 )
									ret := 0.082192
								if( bullPower > -2.8637 )
									ret := 0.394619
					if( bullPower > -1.75208 )
						if( bearPower <= -1.5378 )
							if( bbm <= 2.59841 )
								if( bullPower <= -0.291528 )
									ret := -0.050517
								if( bullPower > -0.291528 )
									ret := 0.381356
							if( bbm > 2.59841 )
								if( bearPower <= -3.28498 )
									ret := 0.387097
								if( bearPower > -3.28498 )
									ret := -0.583333
						if( bearPower > -1.5378 )
							if( bearPower <= -1.33867 )
								if( bbp <= -1.95098 )
									ret := 0.236181
								if( bbp > -1.95098 )
									ret := 0.540984
							if( bearPower > -1.33867 )
								if( bearPower <= -0.498719 )
									ret := 0.128259
								if( bearPower > -0.498719 )
									ret := 0.046607
			if( VIP > 0.82892 )
				if( bearPower <= -0.546946 )
					if( bullPower <= -1.03176 )
						if( VIP <= 1.92271 )
							if( VIP_VIM <= -0.886776 )
								if( bbp <= -4.72443 )
									ret := 0.121951
								if( bbp > -4.72443 )
									ret := 0.761905 // buy
							if( VIP_VIM > -0.886776 )
								if( VIM <= 1.40832 )
									ret := 0.177160
								if( VIM > 1.40832 )
									ret := 0.000000
						if( VIP > 1.92271 )
							if( bearPower <= -2.68914 )
								if( bullPower <= -2.57605 )
									ret := 0.625000
								if( bullPower > -2.57605 )
									ret := 0.071429
							if( bearPower > -2.68914 )
								if( VIP_VIM <= -0.879767 )
									ret := -0.960000 // sell
								if( VIP_VIM > -0.879767 )
									ret := -0.408451
					if( bullPower > -1.03176 )
						if( VIM <= 1.09688 )
							if( bbm <= 0.574479 )
								if( VIM <= 1.07663 )
									ret := 0.000000
								if( VIM > 1.07663 )
									ret := -0.343750
							if( bbm > 0.574479 )
								if( VIP <= 1.22847 )
									ret := 0.111610
								if( VIP > 1.22847 )
									ret := -0.611111
						if( VIM > 1.09688 )
							if( VIM <= 4.66662 )
								if( bearPower <= -1.57341 )
									ret := -0.149515
								if( bearPower > -1.57341 )
									ret := -0.042093
							if( VIM > 4.66662 )
								if( VIP_VIM <= -0.009211 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.009211 )
									ret := 0.500000
				if( bearPower > -0.546946 )
					if( VIP_VIM <= 0.497742 )
						if( bearPower <= -0.197562 )
							if( bbp <= -0.615894 )
								if( bullPower <= -0.196777 )
									ret := 0.057348
								if( bullPower > -0.196777 )
									ret := -0.148000
							if( bbp > -0.615894 )
								if( bullPower <= -0.18207 )
									ret := 0.338462
								if( bullPower > -0.18207 )
									ret := 0.108764
						if( bearPower > -0.197562 )
							if( VIM <= 1.3811 )
								if( VIP_VIM <= 0.227951 )
									ret := -0.025692
								if( VIP_VIM > 0.227951 )
									ret := 0.304598
							if( VIM > 1.3811 )
								if( bearPower <= -0.127438 )
									ret := -0.008065
								if( bearPower > -0.127438 )
									ret := 0.505155
					if( VIP_VIM > 0.497742 )
						if( bearPower <= -0.460667 )
							if( VIM <= 1.29167 )
								ret := -1.000000 // sell
							if( VIM > 1.29167 )
								ret := -0.500000
						if( bearPower > -0.460667 )
							if( bbp <= -0.524101 )
								if( bbm <= 0.133053 )
									ret := 0.000000
								if( bbm > 0.133053 )
									ret := 1.000000 // buy
							if( bbp > -0.524101 )
								if( bullPower <= 0.04747 )
									ret := -0.769231 // sell
								if( bullPower > 0.04747 )
									ret := 0.090909
	if( bullPower > 0.073342 )
		if( bbp <= -2.0421 )
			if( VIM <= 1.20156 )
				if( VIP <= 0.843087 )
					if( bearPower <= -2.48228 )
						if( bearPower <= -4.46848 )
							if( bullPower <= 1.77655 )
								if( bullPower <= 0.482696 )
									ret := 0.500000
								if( bullPower > 0.482696 )
									ret := 0.944444 // buy
							if( bullPower > 1.77655 )
								if( VIP <= 0.697941 )
									ret := 0.444444
								if( VIP > 0.697941 )
									ret := -0.600000
						if( bearPower > -4.46848 )
							if( bbp <= -3.34879 )
								if( bearPower <= -4.15833 )
									ret := -1.000000 // sell
								if( bearPower > -4.15833 )
									ret := -0.750000 // sell
							if( bbp > -3.34879 )
								if( VIP <= 0.80926 )
									ret := 0.789474 // buy
								if( VIP > 0.80926 )
									ret := 0.000000
					if( bearPower > -2.48228 )
						ret := -1.000000 // sell
				if( VIP > 0.843087 )
					if( VIP_VIM <= -0.180607 )
						if( bullPower <= 0.769614 )
							if( VIP <= 0.861056 )
								ret := -0.750000 // sell
							if( VIP > 0.861056 )
								ret := -1.000000 // sell
						if( bullPower > 0.769614 )
							if( bbp <= -3.20625 )
								ret := -0.750000 // sell
							if( bbp > -3.20625 )
								ret := 0.250000
					if( VIP_VIM > -0.180607 )
						if( bbp <= -2.68469 )
							if( VIM <= 1.15048 )
								if( bearPower <= -3.59093 )
									ret := -0.045455
								if( bearPower > -3.59093 )
									ret := 0.533333
							if( VIM > 1.15048 )
								ret := -1.000000 // sell
						if( bbp > -2.68469 )
							if( bearPower <= -2.91993 )
								if( bearPower <= -3.28802 )
									ret := -0.500000
								if( bearPower > -3.28802 )
									ret := -1.000000 // sell
							if( bearPower > -2.91993 )
								if( bullPower <= 0.219273 )
									ret := -0.750000 // sell
								if( bullPower > 0.219273 )
									ret := 0.125000
			if( VIM > 1.20156 )
				if( bbp <= -2.43181 )
					if( bearPower <= -4.76892 )
						if( bbm <= 5.825 )
							if( bearPower <= -5.16447 )
								ret := 1.000000 // buy
							if( bearPower > -5.16447 )
								ret := 0.142857
						if( bbm > 5.825 )
							if( bullPower <= 1.36819 )
								if( bullPower <= 0.718278 )
									ret := -1.000000 // sell
								if( bullPower > 0.718278 )
									ret := 0.333333
							if( bullPower > 1.36819 )
								if( bbp <= -7.73228 )
									ret := -0.750000 // sell
								if( bbp > -7.73228 )
									ret := -1.000000 // sell
					if( bearPower > -4.76892 )
						if( bbm <= 3.84329 )
							if( VIP_VIM <= -0.376978 )
								if( VIP_VIM <= -0.42381 )
									ret := -0.181818
								if( VIP_VIM > -0.42381 )
									ret := 0.500000
							if( VIP_VIM > -0.376978 )
								if( VIM <= 1.55068 )
									ret := -0.923077 // sell
								if( VIM > 1.55068 )
									ret := -0.500000
						if( bbm > 3.84329 )
							if( VIM <= 1.72524 )
								if( VIM <= 1.21968 )
									ret := -0.750000 // sell
								if( VIM > 1.21968 )
									ret := -1.000000 // sell
							if( VIM > 1.72524 )
								ret := -0.500000
				if( bbp > -2.43181 )
					if( VIP <= 1.13446 )
						if( VIP_VIM <= -0.229354 )
							if( VIP <= 0.837616 )
								ret := -0.166667
							if( VIP > 0.837616 )
								if( VIP_VIM <= -0.418813 )
									ret := 0.250000
								if( VIP_VIM > -0.418813 )
									ret := 1.000000 // buy
						if( VIP_VIM > -0.229354 )
							ret := -0.400000
					if( VIP > 1.13446 )
						if( VIP <= 1.20495 )
							ret := -1.000000 // sell
						if( VIP > 1.20495 )
							ret := -0.500000
		if( bbp > -2.0421 )
			if( bearPower <= 0.596154 )
				if( VIP <= 0.78694 )
					if( VIP <= 0.655853 )
						if( VIM <= 1.3009 )
							if( bearPower <= -0.48558 )
								ret := 1.000000 // buy
							if( bearPower > -0.48558 )
								ret := 0.200000
						if( VIM > 1.3009 )
							ret := 0.200000
					if( VIP > 0.655853 )
						if( VIM <= 0.993087 )
							if( bbm <= 1.45 )
								ret := -1.000000 // sell
							if( bbm > 1.45 )
								if( bbm <= 3.425 )
									ret := 0.250000
								if( bbm > 3.425 )
									ret := -0.090909
						if( VIM > 0.993087 )
							if( bbm <= 3.40849 )
								if( VIP_VIM <= -0.338741 )
									ret := 0.358382
								if( VIP_VIM > -0.338741 )
									ret := -0.222222
							if( bbm > 3.40849 )
								if( VIP_VIM <= -0.355927 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.355927 )
									ret := 1.000000 // buy
				if( VIP > 0.78694 )
					if( VIM <= 1.27589 )
						if( VIP_VIM <= -0.328729 )
							if( bbp <= -1.29655 )
								if( bbm <= 1.90163 )
									ret := -1.000000 // sell
								if( bbm > 1.90163 )
									ret := -0.312500
							if( bbp > -1.29655 )
								if( bullPower <= 0.162645 )
									ret := 0.063063
								if( bullPower > 0.162645 )
									ret := 0.408163
						if( VIP_VIM > -0.328729 )
							if( bbm <= 3.0489 )
								if( bullPower <= 2.08186 )
									ret := 0.040161
								if( bullPower > 2.08186 )
									ret := -0.116371
							if( bbm > 3.0489 )
								if( bullPower <= 1.14541 )
									ret := 0.745455 // buy
								if( bullPower > 1.14541 )
									ret := 0.137206
					if( VIM > 1.27589 )
						if( bbm <= 7e-06 )
							if( VIP_VIM <= -0.691151 )
								if( VIP_VIM <= -0.880671 )
									ret := -0.043478
								if( VIP_VIM > -0.880671 )
									ret := 0.473684
							if( VIP_VIM > -0.691151 )
								if( bullPower <= 0.135871 )
									ret := -0.031496
								if( bullPower > 0.135871 )
									ret := -0.233706
						if( bbm > 7e-06 )
							if( VIM <= 1.49762 )
								if( VIP <= 1.4725 )
									ret := -0.120172
								if( VIP > 1.4725 )
									ret := 0.070838
							if( VIM > 1.49762 )
								if( bullPower <= 0.305133 )
									ret := 0.165240
								if( bullPower > 0.305133 )
									ret := 0.021834
			if( bearPower > 0.596154 )
				if( VIM <= 0.75765 )
					if( bbp <= 9.6045 )
						if( bullPower <= 2.25558 )
							if( VIP_VIM <= 1.20012 )
								if( VIP <= 1.58549 )
									ret := 0.006861
								if( VIP > 1.58549 )
									ret := 0.457143
							if( VIP_VIM > 1.20012 )
								if( VIM <= 0.642507 )
									ret := -0.600000
								if( VIM > 0.642507 )
									ret := -1.000000 // sell
						if( bullPower > 2.25558 )
							if( bullPower <= 5.91213 )
								if( bullPower <= 5.64468 )
									ret := 0.214480
								if( bullPower > 5.64468 )
									ret := -0.523810
							if( bullPower > 5.91213 )
								if( VIP_VIM <= 0.573774 )
									ret := 0.285714
								if( VIP_VIM > 0.573774 )
									ret := 0.866667 // buy
					if( bbp > 9.6045 )
						if( bbm <= 10.674 )
							if( VIM <= 0.490452 )
								if( VIP_VIM <= 1.13325 )
									ret := -1.000000 // sell
								if( VIP_VIM > 1.13325 )
									ret := -0.500000
							if( VIM > 0.490452 )
								if( bbm <= 1.7025 )
									ret := 0.350000
								if( bbm > 1.7025 )
									ret := -0.310345
						if( bbm > 10.674 )
							if( bearPower <= 8.38053 )
								ret := 0.250000
							if( bearPower > 8.38053 )
								ret := 1.000000 // buy
				if( VIM > 0.75765 )
					if( bullPower <= 5.16106 )
						if( bbp <= 8.04659 )
							if( VIP_VIM <= 0.333584 )
								if( VIP <= 1.76658 )
									ret := -0.196179
								if( VIP > 1.76658 )
									ret := -0.015184
							if( VIP_VIM > 0.333584 )
								if( VIP <= 4.94178 )
									ret := -0.048481
								if( VIP > 4.94178 )
									ret := -0.794872 // sell
						if( bbp > 8.04659 )
							if( VIP_VIM <= 0.335071 )
								ret := 0.000000
							if( VIP_VIM > 0.335071 )
								if( VIM <= 0.838333 )
									ret := -0.750000 // sell
								if( VIM > 0.838333 )
									ret := -1.000000 // sell
					if( bullPower > 5.16106 )
						if( bbp <= 10.0344 )
							if( bearPower <= 0.997612 )
								if( VIP_VIM <= 0.423837 )
									ret := -0.875000 // sell
								if( VIP_VIM > 0.423837 )
									ret := 0.714286 // buy
							if( bearPower > 0.997612 )
								if( VIP <= 1.57408 )
									ret := 0.739583 // buy
								if( VIP > 1.57408 )
									ret := -0.142857
						if( bbp > 10.0344 )
							if( VIP_VIM <= 0.551319 )
								if( bullPower <= 7.1708 )
									ret := 0.000000
								if( bullPower > 7.1708 )
									ret := 0.888889 // buy
							if( VIP_VIM > 0.551319 )
								if( bearPower <= 4.90243 )
									ret := -0.888889 // sell
								if( bearPower > 4.90243 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_ETSY_15Min_930837a6(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


